package com.seiyrikon.taskmanager.domain.service.task.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskDoneStatusServiceInput {
    private Long id;
    private String userId;
}
