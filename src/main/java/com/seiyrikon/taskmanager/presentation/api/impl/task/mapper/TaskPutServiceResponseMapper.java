package com.seiyrikon.taskmanager.presentation.api.impl.task.mapper;

import com.seiyrikon.taskmanager.common.DefaultMapperConfig;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskPutServiceOutput;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskPutResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = DefaultMapperConfig.class)
public interface TaskPutServiceResponseMapper {
    @Mapping(target = "updated", source = "serviceOutput.updated")
    TaskPutResponse map(TaskPutServiceOutput serviceOutput);
}
