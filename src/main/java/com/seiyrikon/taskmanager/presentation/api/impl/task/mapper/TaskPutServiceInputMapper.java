package com.seiyrikon.taskmanager.presentation.api.impl.task.mapper;

import com.seiyrikon.taskmanager.common.DefaultMapperConfig;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskPutServiceInput;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskPutRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = DefaultMapperConfig.class)
public interface TaskPutServiceInputMapper {
    @Mapping(target = "name", source = "request.name")
    @Mapping(target = "description", source = "request.description")
    TaskPutServiceInput map(TaskPutRequest request);
}
