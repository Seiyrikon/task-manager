package com.seiyrikon.taskmanager.domain.service.task;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.User;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskPostServiceInput;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskPostServiceOutput;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskPostServiceResult;
import com.seiyrikon.taskmanager.infrastracture.repository.dbaccess.tables.interfaces.TaskRepository;
import com.seiyrikon.taskmanager.infrastracture.repository.dbaccess.tables.interfaces.UserRepository;
import com.seiyrikon.taskmanager.presentation.api.impl.task.mapper.TaskPostServiceOutputMapper;
import com.seiyrikon.taskmanager.presentation.api.impl.task.mapper.TaskPostServiceResponseMapper;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskPostResponse;
import com.seiyrikon.taskmanager.shared.AppConstants;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class TaskPostService {

    private final TaskRepository repository;
    private final TaskPostServiceOutputMapper outputMapper;
    private final UserRepository userRepository;

    public TaskPostService(TaskRepository repository, TaskPostServiceOutputMapper outputMapper, UserRepository userRepository) {
        this.repository = repository;
        this.outputMapper = outputMapper;
        this.userRepository = userRepository;
    }

    public TaskPostServiceOutput executeService(TaskPostServiceInput serviceInput) {
        User adminUser = userRepository.findById(AppConstants.ADMIN_ID).orElseThrow();

        Task entity = Task.builder()
                .name(serviceInput.getName())
                .description(serviceInput.getDescription())
                .status(AppConstants.DEFAULT_TASK_STATUS)
                .user(adminUser)
                .addedBy(AppConstants.ADMIN)
                .addedAt(LocalDateTime.now())
                .updatedBy(AppConstants.ADMIN)
                .updatedAt(LocalDateTime.now())
                .build();

        Task task = repository.save(entity);
        TaskPostServiceResult result = new TaskPostServiceResult(task);

        return outputMapper.map(result);
    }
}
