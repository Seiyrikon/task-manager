package com.seiyrikon.taskmanager.presentation.api.impl.task.mapper;

import com.seiyrikon.taskmanager.common.DefaultMapperConfig;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskGetServiceInput;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskGetRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = DefaultMapperConfig.class)
public interface TaskGetServiceInputMapper {

    @Mapping(target = "id", source = "serviceInput.id")
    TaskGetServiceInput map(TaskGetRequest serviceInput);
}
