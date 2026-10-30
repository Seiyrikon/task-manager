package com.seiyrikon.taskmanager.presentation.api.impl.task.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public class TaskDoneStatusResponse {
    @JsonProperty("is_updated")
    private @Valid @NotNull Boolean updated;

    @JsonProperty("is_updated")
    @NotNull
    public Boolean getUpdated() {
        return updated;
    }

    @JsonProperty("is_updated")
    public void setUpdated(Boolean updated) {
        this.updated = updated;
    }
}
