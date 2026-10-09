package com.seiyrikon.taskmanager.domain.service.task.dto;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskGetServiceResult {
    private String name;
    private String description;
    private String status;
    private Long user_id;

    public TaskGetServiceResult(Task task) {
        this.name = task.getName();
        this.description = task.getDescription();
        this.status = task.getStatus();
        this.user_id = task.getUser().getId();
    }
}
