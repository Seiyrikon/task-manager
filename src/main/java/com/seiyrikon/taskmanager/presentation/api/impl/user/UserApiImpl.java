package com.seiyrikon.taskmanager.presentation.api.impl.user;

import com.seiyrikon.taskmanager.domain.service.user.UserPostService;
import com.seiyrikon.taskmanager.domain.service.user.dto.UserPostServiceInput;
import com.seiyrikon.taskmanager.domain.service.user.dto.UserPostServiceOutput;
import com.seiyrikon.taskmanager.presentation.api.impl.user.mapper.UserPostServiceInputMapper;
import com.seiyrikon.taskmanager.presentation.api.impl.user.mapper.UserPostServiceOutputMapper;
import com.seiyrikon.taskmanager.presentation.api.impl.user.mapper.UserPostServiceResponseMapper;
import com.seiyrikon.taskmanager.presentation.api.impl.user.model.UserPostRequest;
import com.seiyrikon.taskmanager.presentation.api.impl.user.model.UserPostResponse;
import com.seiyrikon.taskmanager.presentation.api.interfaces.user.UserApi;
import org.springframework.stereotype.Service;

@Service
public class UserApiImpl implements UserApi {

    private final UserPostServiceInputMapper userPostServiceInputMapper;
    private final UserPostServiceResponseMapper userPostServiceResponseMapper;
    private final UserPostService userPostService;

    public UserApiImpl(UserPostServiceInputMapper userPostServiceInputMapper,
                       UserPostServiceResponseMapper userPostServiceResponseMapper,
                       UserPostService userPostService) {
        this.userPostServiceInputMapper = userPostServiceInputMapper;
        this.userPostServiceResponseMapper = userPostServiceResponseMapper;
        this.userPostService = userPostService;
    }

    @Override
    public UserPostResponse post(UserPostRequest request) {
        UserPostServiceInput serviceInput = userPostServiceInputMapper.map(request);
        UserPostServiceOutput serviceOutput = userPostService.executeService(serviceInput);
        return userPostServiceResponseMapper.map(serviceOutput);
    }
}
