package com.seiyrikon.taskmanager.infrastracture.repository.dbaccess.query.impl;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.query.dto.TaskParam;
import com.seiyrikon.taskmanager.domain.entity.dbaccess.query.dto.TaskResult;
import com.seiyrikon.taskmanager.domain.entity.dbaccess.query.interfaces.TaskCustomQuery;

public class TaskCustomQueryImpl implements TaskCustomQuery {
    @Override
    public TaskResult someCustomQuery(TaskParam param) {
        //custom query implementation
        return null;
    }
}
