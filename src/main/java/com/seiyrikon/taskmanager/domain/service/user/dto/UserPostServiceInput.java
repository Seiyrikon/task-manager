package com.seiyrikon.taskmanager.domain.service.user.dto;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserPostServiceInput {
    private User user;
}
