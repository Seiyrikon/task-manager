package com.seiyrikon.taskmanager.presentation.api.impl.user.mapper;

import com.seiyrikon.taskmanager.common.DefaultMapperConfig;
import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.User;
import com.seiyrikon.taskmanager.domain.service.user.dto.UserPostServiceInput;
import com.seiyrikon.taskmanager.presentation.api.impl.user.model.UserPostRequest;
import com.seiyrikon.taskmanager.shared.AppConstants;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import java.time.LocalDateTime;

@Mapper(config = DefaultMapperConfig.class)
public interface UserPostServiceInputMapper {

    @Mapping(target = "id", source = "request.id")
    UserPostServiceInput map(UserPostRequest request);
}
