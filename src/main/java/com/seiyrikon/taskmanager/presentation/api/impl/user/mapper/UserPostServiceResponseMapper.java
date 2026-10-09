package com.seiyrikon.taskmanager.presentation.api.impl.user.mapper;

import com.seiyrikon.taskmanager.common.DefaultMapperConfig;
import com.seiyrikon.taskmanager.domain.service.user.dto.UserPostServiceOutput;
import com.seiyrikon.taskmanager.presentation.api.impl.user.model.UserPostResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = DefaultMapperConfig.class)
public interface UserPostServiceResponseMapper {

    @Mapping(target = "isCreated", source = "serviceOutput.isCreated")
    UserPostResponse map(UserPostServiceOutput serviceOutput);
}
