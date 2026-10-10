package com.seiyrikon.taskmanager.presentation.api.interfaces.task;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskGetServiceInput;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskGetRequest;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskGetResponse;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskPostRequest;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskPostResponse;

import java.util.List;

public interface TaskApi {
    TaskGetResponse get(TaskGetRequest request);
    TaskPostResponse post(TaskPostRequest request);
}
