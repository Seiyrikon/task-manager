package com.seiyrikon.taskmanager.controller.rest;

import com.seiyrikon.taskmanager.domain.entity.dbaccess.tables.Task;
import com.seiyrikon.taskmanager.model.dto.task.TaskResponseDto;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskGetRequest;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskGetResponse;
import com.seiyrikon.taskmanager.presentation.api.interfaces.task.TaskApi;
import com.seiyrikon.taskmanager.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class TaskController {

//    private final TaskApi taskService;
//
//    public TaskController(TaskApi taskService) {
//        this.taskService = taskService;
//    }

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping("/tasks")
    public ResponseEntity<List<TaskResponseDto>> get() {
//        TaskGetRequest request = new TaskGetRequest();
        return ResponseEntity.ok(service.getAllTask());
    }
}
