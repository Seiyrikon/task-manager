package com.seiyrikon.taskmanager.domain.service.task.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskPutServiceInput {
    private Long id;
    private String name;
    private String description;
}
