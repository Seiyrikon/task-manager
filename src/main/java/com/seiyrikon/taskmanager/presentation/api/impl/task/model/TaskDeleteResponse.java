package com.seiyrikon.taskmanager.presentation.api.impl.task.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public class TaskDeleteResponse {
    @JsonProperty("is_deleted")
    @Valid
    @NotNull
    private Boolean deleted;

    @JsonProperty("is_deleted")
    @NotNull
    public Boolean getDeleted() {
        return deleted;
    }

    @JsonProperty("is_deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
