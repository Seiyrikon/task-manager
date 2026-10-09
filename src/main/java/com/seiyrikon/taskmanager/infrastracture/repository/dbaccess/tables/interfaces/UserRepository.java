package com.seiyrikon.taskmanager.infrastracture.repository.dbaccess.tables.interfaces;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
