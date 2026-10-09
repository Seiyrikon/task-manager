package com.seiyrikon.taskmanager.presentation.api.impl.user.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public class UserPostRequest {
    private @Valid Long id;

    @JsonProperty("id")
    @NotNull()
    public Long getId() {
        return this.id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }
}
