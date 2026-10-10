package com.seiyrikon.taskmanager.presentation.api.impl.task.mapper;

import com.seiyrikon.taskmanager.common.DefaultMapperConfig;
import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskPostServiceOutput;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskPostServiceResult;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(config = DefaultMapperConfig.class)
public interface TaskPostServiceOutputMapper {
    @Mapping(target = "created", source = "result.task", qualifiedByName = "toIsCreated")
    TaskPostServiceOutput map(TaskPostServiceResult result);

    @Named("toIsCreated")
    default Boolean toIsCreated(Task task) {
        return task != null;
    }
}
