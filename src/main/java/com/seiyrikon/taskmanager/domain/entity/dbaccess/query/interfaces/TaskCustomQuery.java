package com.seiyrikon.taskmanager.domain.entity.dbaccess.query.interfaces;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.query.dto.TaskParam;
import com.seiyrikon.taskmanager.domain.entity.dbaccess.query.dto.TaskResult;

public interface TaskCustomQuery {
    TaskResult someCustomQuery(TaskParam param);
}
