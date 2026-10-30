package com.seiyrikon.taskmanager.presentation.api.impl.task.mapper;

import com.seiyrikon.taskmanager.common.DefaultMapperConfig;
import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskDeleteServiceOutput;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskDeleteServiceResult;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(config = DefaultMapperConfig.class)
public interface TaskDeleteServiceOutputMapper {
    @Mapping(target = "deleted", source = "result.task", qualifiedByName = "toIsDeleted")
    TaskDeleteServiceOutput map(TaskDeleteServiceResult result);

    @Named("toIsDeleted")
    default Boolean toIsDeleted(Task task) {
        return task == null;
    }
}
