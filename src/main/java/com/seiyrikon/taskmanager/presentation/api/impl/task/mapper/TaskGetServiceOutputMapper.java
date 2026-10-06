package com.seiyrikon.taskmanager.presentation.api.impl.task.mapper;

import com.seiyrikon.taskmanager.common.DefaultMapperConfig;
import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskGetServiceOutput;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskGetServiceResult;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(config = DefaultMapperConfig.class)
public interface TaskGetServiceOutputMapper {
    @Mapping(target = "tasks", source = "serviceOutput.tasks")
    TaskGetServiceOutput map(TaskGetServiceOutput serviceOutput);
}
