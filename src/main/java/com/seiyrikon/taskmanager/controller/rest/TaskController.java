package com.seiyrikon.taskmanager.controller.rest;

import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskGetRequest;
import com.seiyrikon.taskmanager.presentation.api.impl.task.model.TaskGetResponse;
import com.seiyrikon.taskmanager.presentation.api.interfaces.task.TaskApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class TaskController {

    private final TaskApi taskApi;

    public TaskController(TaskApi taskApi) {
        this.taskApi = taskApi;
    }

    @GetMapping("/task")
    public ResponseEntity<TaskGetResponse> get() {
        TaskGetRequest request = new TaskGetRequest();
        request.setId("1");
        return ResponseEntity.ok(taskApi.get(request));
    }
}
