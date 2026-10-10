package com.seiyrikon.taskmanager.presentation.api.impl.task.mapper;

import com.seiyrikon.taskmanager.common.DefaultMapperConfig;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskPostServiceInput;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskPostRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = DefaultMapperConfig.class)
public interface TaskPostServiceInputMapper {

    @Mapping(target = "name", source = "request.name")
    @Mapping(target = "description", source = "request.description")
    TaskPostServiceInput map(TaskPostRequest request);
}
