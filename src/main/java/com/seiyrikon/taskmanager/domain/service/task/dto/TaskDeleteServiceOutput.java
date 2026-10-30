package com.seiyrikon.taskmanager.domain.service.task.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskDeleteServiceOutput {
    private Boolean deleted;
}
