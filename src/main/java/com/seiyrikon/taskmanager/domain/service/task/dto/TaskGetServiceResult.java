package com.seiyrikon.taskmanager.domain.service.task.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskGetServiceResult {
    private String name;
    private String description;
    private String status;
}
