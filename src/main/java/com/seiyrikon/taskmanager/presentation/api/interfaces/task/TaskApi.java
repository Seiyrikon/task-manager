package com.seiyrikon.taskmanager.presentation.api.interfaces.task;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskGetServiceInput;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.*;
import com.seiyrikon.taskmanager.shared.Principal;

import java.util.List;

public interface TaskApi {
    TaskGetResponse get(TaskGetRequest request);
    TaskPostResponse post(TaskPostRequest request);
    TaskPutResponse put(TaskPutRequest request);
    TaskDoneStatusResponse doneStatus(TaskDoneStatusRequest request);
    TaskDeleteResponse delete(TaskDeleteRequest request);
}
