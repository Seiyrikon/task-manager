package com.seiyrikon.taskmanager.presentation.api.impl.task.mapper;

import com.seiyrikon.taskmanager.common.DefaultMapperConfig;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskDeleteServiceOutput;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskDeleteResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = DefaultMapperConfig.class)
public interface TaskDeleteServiceResponseMapper {
    @Mapping(target = "deleted", source = "serviceOutput.deleted")
    TaskDeleteResponse map(TaskDeleteServiceOutput serviceOutput);
}
