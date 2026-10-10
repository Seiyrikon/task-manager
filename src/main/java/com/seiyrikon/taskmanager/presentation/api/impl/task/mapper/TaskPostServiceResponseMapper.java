package com.seiyrikon.taskmanager.presentation.api.impl.task.mapper;

import com.seiyrikon.taskmanager.common.DefaultMapperConfig;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskPostServiceOutput;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskPostServiceResult;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskPostResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = DefaultMapperConfig.class)
public interface TaskPostServiceResponseMapper {

    @Mapping(target = "created", source = "serviceOutput.created")
    TaskPostResponse map(TaskPostServiceOutput serviceOutput);
}
