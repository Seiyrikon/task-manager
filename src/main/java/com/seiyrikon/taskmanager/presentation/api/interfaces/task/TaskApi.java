package com.seiyrikon.taskmanager.presentation.api.interfaces.task;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskGetRequest;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskGetResponse;

import java.util.List;

public interface TaskApi {
    List<Task> get();
}
