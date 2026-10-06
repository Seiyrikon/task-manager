package com.seiyrikon.taskmanager.domain.service.task.dto;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import com.seiyrikon.taskmanager.model.dto.task.TaskServiceOutputDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskGetServiceResponse {
    private List<TaskGetServiceOutput> response;
}
