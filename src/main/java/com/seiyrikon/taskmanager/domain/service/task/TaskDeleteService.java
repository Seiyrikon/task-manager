package com.seiyrikon.taskmanager.domain.service.task;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskDeleteServiceInput;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskDeleteServiceOutput;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskDeleteServiceResult;
import com.seiyrikon.taskmanager.infrastracture.repository.dbaccess.tables.interfaces.TaskRepository;
import com.seiyrikon.taskmanager.presentation.api.impl.task.mapper.TaskDeleteServiceOutputMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskDeleteService {
    private final TaskRepository repository;
    private final TaskDeleteServiceOutputMapper outputMapper;

    public TaskDeleteServiceOutput executeService(TaskDeleteServiceInput serviceInput) {
        Task entity = repository.findById(serviceInput.getId()).orElseThrow();

        repository.delete(entity);
        Task task = repository.findById(serviceInput.getId()).orElse(null);
        TaskDeleteServiceResult result = new TaskDeleteServiceResult(task);

        return outputMapper.map(result);
    }
}
