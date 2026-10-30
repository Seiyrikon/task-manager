package com.seiyrikon.taskmanager.presentation.api.impl.task.mapper;

import com.seiyrikon.taskmanager.common.DefaultMapperConfig;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskDeleteServiceInput;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskDeleteRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = DefaultMapperConfig.class)
public interface TaskDeleteServiceInputMapper {
    @Mapping(target = "id", source = "request.id")
    @Mapping(target = "userId", source = "userId")
    TaskDeleteServiceInput map(TaskDeleteRequest request, String userId);
}
