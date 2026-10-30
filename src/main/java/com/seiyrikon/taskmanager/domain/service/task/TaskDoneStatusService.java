package com.seiyrikon.taskmanager.domain.service.task;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskDoneStatusServiceInput;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskDoneStatusServiceOutput;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskDoneStatusServiceResult;
import com.seiyrikon.taskmanager.infrastracture.repository.dbaccess.tables.interfaces.TaskRepository;
import com.seiyrikon.taskmanager.presentation.api.impl.task.mapper.TaskDoneStatusServiceOutputMapper;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskDoneStatusResponse;
import com.seiyrikon.taskmanager.shared.AppConstants;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TaskDoneStatusService {

    private final TaskRepository repository;
    private final TaskDoneStatusServiceOutputMapper outputMapper;

    public TaskDoneStatusService(TaskRepository repository, TaskDoneStatusServiceOutputMapper outputMapper) {
        this.repository = repository;
        this.outputMapper = outputMapper;
    }

    public TaskDoneStatusServiceOutput executeService(TaskDoneStatusServiceInput serviceInput) {
        Task entity = repository.findById(serviceInput.getId()).orElseThrow();

        entity.setStatus(AppConstants.DONE_TASK_STATUS);
        entity.setUpdatedBy(serviceInput.getUserId());
        entity.setUpdatedAt(LocalDateTime.now());

        Task task = repository.save(entity);
        TaskDoneStatusServiceResult result = new TaskDoneStatusServiceResult(task);

        return outputMapper.map(result);
    }
}
