package com.seiyrikon.taskmanager.domain.service.task.dto;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskGetServiceOutput {
    List<TaskGetServiceResult> tasks;
}
