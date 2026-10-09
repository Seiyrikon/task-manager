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

    @Mapping(target = "user", source = "request.id", qualifiedByName = "toUser")
    UserPostServiceInput map(UserPostRequest request);

    @Named("toUser")
    default User toUser(Long userId) {
        return User.builder()
                .addedBy(AppConstants.ADMIN)
                .addedAt(LocalDateTime.now())
                .updatedBy(AppConstants.ADMIN)
                .updatedAt(LocalDateTime.now())
                .build();
    }
}
