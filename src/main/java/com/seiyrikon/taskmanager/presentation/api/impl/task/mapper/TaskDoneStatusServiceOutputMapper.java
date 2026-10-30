package com.seiyrikon.taskmanager.presentation.api.impl.task.mapper;

import com.seiyrikon.taskmanager.common.DefaultMapperConfig;
import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskDoneStatusServiceOutput;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskDoneStatusServiceResult;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskDoneStatusResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(config = DefaultMapperConfig.class)
public interface TaskDoneStatusServiceOutputMapper {
    @Mapping(target = "updated", source = "result.task", qualifiedByName = "toIsUpdated")
    TaskDoneStatusServiceOutput map(TaskDoneStatusServiceResult result);

    @Named("toIsUpdated")
    default Boolean toIsUpdated(Task task) {
        return task != null;
    }
}
