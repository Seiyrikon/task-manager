package com.seiyrikon.taskmanager.domain.service.task;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.User;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskPutServiceInput;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskPutServiceOutput;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskPutServiceResult;
import com.seiyrikon.taskmanager.infrastracture.repository.dbaccess.tables.interfaces.TaskRepository;
import com.seiyrikon.taskmanager.infrastracture.repository.dbaccess.tables.interfaces.UserRepository;
import com.seiyrikon.taskmanager.presentation.api.impl.task.mapper.TaskPutServiceOutputMapper;
import com.seiyrikon.taskmanager.shared.AppConstants;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TaskPutService {

    private final TaskRepository repository;
    private final TaskPutServiceOutputMapper outputMapper;
    private final UserRepository userRepository;

    public TaskPutService(TaskRepository repository, TaskPutServiceOutputMapper outputMapper, UserRepository userRepository) {
        this.repository = repository;
        this.outputMapper = outputMapper;
        this.userRepository = userRepository;
    }

    public TaskPutServiceOutput executeService(TaskPutServiceInput serviceInput) {
        User userAdmin = userRepository.findById(AppConstants.ADMIN_ID).orElseThrow();

        Task entity = repository.findById(serviceInput.getId()).orElseThrow();

        entity.setName(serviceInput.getName());
        entity.setDescription(serviceInput.getDescription());
        entity.setUser(userAdmin);
        entity.setUpdatedBy(userAdmin.getId().toString());
        entity.setUpdatedAt(LocalDateTime.now());

        Task task = repository.save(entity);

        TaskPutServiceResult result = new TaskPutServiceResult(task);
        return outputMapper.map(result);
    }
}
