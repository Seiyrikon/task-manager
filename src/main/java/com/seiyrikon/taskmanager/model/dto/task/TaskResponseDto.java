package com.seiyrikon.taskmanager.model.dto.task;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskResponseDto {
    private String name;
    private String description;
    private String status;
}
