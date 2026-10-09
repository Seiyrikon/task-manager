package com.seiyrikon.taskmanager.domain.service.task.dto;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import com.seiyrikon.taskmanager.model.dto.task.TaskServiceOutputDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskGetServiceResponse {
    private List<TaskGetServiceOutput> response;
}
