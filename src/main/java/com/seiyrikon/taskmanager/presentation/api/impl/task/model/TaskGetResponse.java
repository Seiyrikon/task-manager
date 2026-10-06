package com.seiyrikon.taskmanager.presentation.api.impl.task.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import com.seiyrikon.taskmanager.domain.service.task.dto.TaskGetServiceResult;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.List;

@JsonTypeName("taskResponse")
@Data
public class TaskGetResponse {
    @JsonProperty("tasks")
    private @Valid List<TaskGetServiceResult> tasks;
}
