package com.seiyrikon.taskmanager.presentation.api.impl.task;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import com.seiyrikon.taskmanager.domain.service.task.TaskGetService;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskGetServiceInput;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskGetServiceOutput;
import com.seiyrikon.taskmanager.presentation.api.impl.task.mapper.TaskGetServiceInputMapper;
import com.seiyrikon.taskmanager.presentation.api.impl.task.mapper.TaskGetServiceResponseMapper;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskGetRequest;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskGetResponse;
import com.seiyrikon.taskmanager.presentation.api.interfaces.task.TaskApi;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskApiImpl implements TaskApi {

    private final TaskGetServiceInputMapper taskGetServiceInputMapper;
    private final TaskGetServiceResponseMapper taskGetServiceResponseMapper;
    private final TaskGetService taskGetService;

    public TaskApiImpl(TaskGetServiceInputMapper taskGetServiceInputMapper,
                       TaskGetServiceResponseMapper taskGetServiceResponseMapper,
                       TaskGetService taskGetService) {
        this.taskGetServiceInputMapper = taskGetServiceInputMapper;
        this.taskGetServiceResponseMapper = taskGetServiceResponseMapper;
        this.taskGetService = taskGetService;
    }

    @Override
    public List<Task> get() {
//        TaskGetServiceInput serviceInput = taskGetServiceInputMapper.map(request);
//        TaskGetServiceOutput serviceOutput = taskGetService.executeService(serviceInput);
        return taskGetService.executeService();
    }
}
