package com.seiyrikon.taskmanager.presentation.api.impl.user.mapper;

import com.seiyrikon.taskmanager.common.DefaultMapperConfig;
import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.User;
import com.seiyrikon.taskmanager.domain.service.user.dto.UserPostServiceOutput;
import com.seiyrikon.taskmanager.domain.service.user.dto.UserPostServiceResult;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(config = DefaultMapperConfig.class)
public interface UserPostServiceOutputMapper {

    @Mapping(target = "isCreated", source = "result", qualifiedByName = "toIsCreated")
    UserPostServiceOutput map(UserPostServiceResult result);

    @Named("toIsCreated")
    default Boolean toIsCreated(User user) {
        return user != null;
    }
}
