package com.seiyrikon.taskmanager.presentation.api.impl.task.mapper;

import com.seiyrikon.taskmanager.common.DefaultMapperConfig;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskGetServiceOutput;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskGetResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = DefaultMapperConfig.class)
public interface TaskGetServiceResponseMapper {
    @Mapping(target = "tasks", source = "serviceOutput.tasks")
    TaskGetResponse map(TaskGetServiceOutput serviceOutput);
}
