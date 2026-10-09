package com.seiyrikon.taskmanager.controller.rest;

import com.seiyrikon.taskmanager.presentation.api.impl.user.model.UserPostRequest;
import com.seiyrikon.taskmanager.presentation.api.impl.user.model.UserPostResponse;
import com.seiyrikon.taskmanager.presentation.api.interfaces.user.UserApi;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class UserController {

    private final UserApi userApi;

    public UserController(UserApi userApi) {
        this.userApi = userApi;
    }

    @PostMapping("/user")
    public ResponseEntity<UserPostResponse> post(@RequestBody @Valid @NotNull UserPostRequest request) {
        return ResponseEntity.ok(userApi.post(request));
    }
}
