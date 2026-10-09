package com.seiyrikon.taskmanager.domain.service.user;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.User;
import com.seiyrikon.taskmanager.domain.service.user.dto.UserPostServiceInput;
import com.seiyrikon.taskmanager.domain.service.user.dto.UserPostServiceOutput;
import com.seiyrikon.taskmanager.domain.service.user.dto.UserPostServiceResult;
import com.seiyrikon.taskmanager.infrastracture.repository.dbaccess.tables.interfaces.UserRepository;
import com.seiyrikon.taskmanager.presentation.api.impl.user.mapper.UserPostServiceOutputMapper;
import org.springframework.stereotype.Service;

@Service
public class UserPostService {

    private final UserRepository repository;
    private final UserPostServiceOutputMapper outputMapper;

    public UserPostService(UserRepository repository, UserPostServiceOutputMapper outputMapper) {
        this.repository = repository;
        this.outputMapper = outputMapper;
    }

    public UserPostServiceOutput executeService(UserPostServiceInput serviceInput) {
        User user = repository.save(serviceInput.getUser());
        UserPostServiceResult result = new UserPostServiceResult(user);
        return outputMapper.map(result);
    }
}
