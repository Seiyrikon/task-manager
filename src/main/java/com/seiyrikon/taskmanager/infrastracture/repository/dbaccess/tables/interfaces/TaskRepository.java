package com.seiyrikon.taskmanager.infrastracture.repository.dbaccess.tables.interfaces;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
