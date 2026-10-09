package com.seiyrikon.taskmanager.domain.service.task.dto;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskGetServiceOutput {
    List<TaskGetServiceResult> tasks;
}
