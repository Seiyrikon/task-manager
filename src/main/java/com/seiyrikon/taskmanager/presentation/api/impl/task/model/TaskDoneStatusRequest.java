package com.seiyrikon.taskmanager.presentation.api.impl.task.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public class TaskDoneStatusRequest {
    @JsonProperty("id")
    @Valid
    @NotNull
    private Long id;

    @JsonProperty("id")
    @NotNull
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }
}
