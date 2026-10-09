package com.seiyrikon.taskmanager.presentation.api.impl.user.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserPostResponse {
    @JsonProperty("is_created")
    private Boolean isCreated;
}
