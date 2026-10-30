package com.seiyrikon.taskmanager.presentation.api.impl.task.mapper;

import com.seiyrikon.taskmanager.common.DefaultMapperConfig;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskDoneStatusServiceInput;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskDoneStatusRequest;
import com.seiyrikon.taskmanager.shared.Principal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = DefaultMapperConfig.class)
public interface TaskDoneStatusServiceInputMapper {
    @Mapping(target = "id", source = "request.id")
    @Mapping(target = "userId", source = "userId")
    TaskDoneStatusServiceInput map(TaskDoneStatusRequest request, String userId);
}
