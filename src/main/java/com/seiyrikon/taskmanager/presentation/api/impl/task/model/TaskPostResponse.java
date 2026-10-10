package com.seiyrikon.taskmanager.presentation.api.impl.task.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;

public class TaskPostResponse {
    @JsonProperty("is_created")
    private Boolean created;

    @JsonProperty("is_created")
    @NotNull
    public Boolean getCreated() {
        return created;
    }

    @JsonProperty("is_created")
    public void setCreated(Boolean created) {
        this.created = created;
    }
}
