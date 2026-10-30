package com.seiyrikon.taskmanager.presentation.api.impl.task;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import com.seiyrikon.taskmanager.domain.service.task.*;
import com.seiyrikon.taskmanager.domain.service.task.dto.*;
import com.seiyrikon.taskmanager.presentation.api.impl.task.mapper.*;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.*;
import com.seiyrikon.taskmanager.presentation.api.interfaces.task.TaskApi;
import com.seiyrikon.taskmanager.shared.Principal;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskApiImpl implements TaskApi {

    private final TaskGetServiceInputMapper taskGetServiceInputMapper;
    private final TaskGetServiceResponseMapper taskGetServiceResponseMapper;
    private final TaskGetService taskGetService;
    private final TaskPostServiceInputMapper taskPostServiceInputMapper;
    private final TaskPostServiceResponseMapper taskPostServiceResponseMapper;
    private final TaskPostService taskPostService;
    private final TaskPutServiceInputMapper taskPutServiceInputMapper;
    private final TaskPutServiceResponseMapper taskPutServiceResponseMapper;
    private final TaskPutService taskPutService;
    private final TaskDoneStatusServiceInputMapper taskDoneStatusServiceInputMapper;
    private final TaskDoneStatusServiceResponseMapper taskDoneStatusServiceResponseMapper;
    private final TaskDoneStatusService taskDoneStatusService;
    private final TaskDeleteServiceInputMapper taskDeleteServiceInputMapper;
    private final TaskDeleteServiceResponseMapper taskDeleteServiceResponseMapper;
    private final TaskDeleteService taskDeleteService;

    @Override
    public TaskGetResponse get(TaskGetRequest request) {
        TaskGetServiceInput serviceInput = taskGetServiceInputMapper.map(request);
        TaskGetServiceOutput serviceOutput = taskGetService.executeService(serviceInput);
        return taskGetServiceResponseMapper.map(serviceOutput);
    }

    @Override
    public TaskPostResponse post(TaskPostRequest request) {
        TaskPostServiceInput serviceInput = taskPostServiceInputMapper.map(request);
        TaskPostServiceOutput serviceOutput = taskPostService.executeService(serviceInput);
        return taskPostServiceResponseMapper.map(serviceOutput);
    }

    @Override
    public TaskPutResponse put(TaskPutRequest request) {
        TaskPutServiceInput serviceInput = taskPutServiceInputMapper.map(request);
        TaskPutServiceOutput serviceOutput = taskPutService.executeService(serviceInput);
        return taskPutServiceResponseMapper.map(serviceOutput);
    }

    @Override
    public TaskDoneStatusResponse doneStatus(TaskDoneStatusRequest request) {
        TaskDoneStatusServiceInput serviceInput = taskDoneStatusServiceInputMapper.map(request, Principal.getId());
        TaskDoneStatusServiceOutput serviceOutput = taskDoneStatusService.executeService(serviceInput);
        return taskDoneStatusServiceResponseMapper.map(serviceOutput);
    }

    @Override
    public TaskDeleteResponse delete(TaskDeleteRequest request) {
        TaskDeleteServiceInput serviceInput = taskDeleteServiceInputMapper.map(request, Principal.getId());
        TaskDeleteServiceOutput serviceOutput = taskDeleteService.executeService(serviceInput);
        return taskDeleteServiceResponseMapper.map(serviceOutput);
    }

}
