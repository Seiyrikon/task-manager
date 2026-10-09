package com.seiyrikon.taskmanager.presentation.api.interfaces.user;

import com.seiyrikon.taskmanager.presentation.api.impl.user.model.UserPostRequest;
import com.seiyrikon.taskmanager.presentation.api.impl.user.model.UserPostResponse;

public interface UserApi {
    UserPostResponse post(UserPostRequest request);
}
