package com.seiyrikon.taskmanager.presentation.api.impl.task.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class TaskGetRequest {
    private @Valid String id;

    @JsonProperty("id")
    @NotNull()
    public String getId() {
        return this.id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }
}
