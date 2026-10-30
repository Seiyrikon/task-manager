package com.seiyrikon.taskmanager.presentation.api.impl.task.mapper;

import com.seiyrikon.taskmanager.common.DefaultMapperConfig;
import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskPutServiceOutput;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskPutServiceResult;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(config = DefaultMapperConfig.class)
public interface TaskPutServiceOutputMapper {

    @Mapping(target = "updated", source = "result.task", qualifiedByName = "toIsUpdated")
    TaskPutServiceOutput map(TaskPutServiceResult result);

    @Named("toIsUpdated")
    default Boolean toIsUpdated(Task task) {
        return task != null;
    }
}
