package com.seiyrikon.taskmanager.domain.service.task;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskGetServiceInput;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskGetServiceOutput;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskGetServiceResponse;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskGetServiceResult;
import com.seiyrikon.taskmanager.infrastracture.repository.dbaccess.tables.interfaces.TaskRepository;
import com.seiyrikon.taskmanager.presentation.api.impl.task.mapper.TaskGetServiceOutputMapper;
import com.seiyrikon.taskmanager.presentation.api.impl.task.mapper.TaskGetServiceResponseMapper;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskGetResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskGetService {

    private final TaskRepository repository;
    private final TaskGetServiceOutputMapper outputMapper;
    private final TaskGetServiceResponseMapper responseMapper;

    public TaskGetService(TaskRepository repository, TaskGetServiceOutputMapper outputMapper, TaskGetServiceResponseMapper responseMapper) {
        this.repository = repository;
        this.outputMapper = outputMapper;
        this.responseMapper = responseMapper;
    }

    public List<Task> executeService() {
        return repository.findAll();
    }
}
