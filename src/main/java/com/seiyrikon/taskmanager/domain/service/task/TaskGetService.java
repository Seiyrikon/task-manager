package com.seiyrikon.taskmanager.domain.service.task;

import com.seiyrikon.taskmanager.domain.service.task.dto.TaskGetServiceInput;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskGetServiceOutput;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskGetServiceResult;
import com.seiyrikon.taskmanager.infrastracture.repository.dbaccess.tables.interfaces.TaskRepository;
import com.seiyrikon.taskmanager.presentation.api.impl.task.mapper.TaskGetServiceOutputMapper;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskGetService {

    private final TaskRepository repository;
    private final TaskGetServiceOutputMapper outputMapper;

    public TaskGetService(TaskRepository repository, TaskGetServiceOutputMapper outputMapper) {
        this.repository = repository;
        this.outputMapper = outputMapper;
    }

    @Cacheable("tasks")
    public TaskGetServiceOutput executeService(TaskGetServiceInput serviceInput) {
        List<TaskGetServiceResult> result = repository.findAll()
                .stream()
                .map(TaskGetServiceResult::new)
                .toList();

        return outputMapper.map(new TaskGetServiceOutput(result));
    }
}
