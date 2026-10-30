package com.seiyrikon.taskmanager.presentation.api.impl.task.mapper;

import com.seiyrikon.taskmanager.common.DefaultMapperConfig;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskDoneStatusServiceOutput;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskDoneStatusResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = DefaultMapperConfig.class)
public interface TaskDoneStatusServiceResponseMapper {
    @Mapping(target = "updated", source = "serviceOutput.updated")
    TaskDoneStatusResponse map(TaskDoneStatusServiceOutput serviceOutput);
}
