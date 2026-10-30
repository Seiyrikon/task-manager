package com.seiyrikon.taskmanager.controller.rest;

import com.seiyrikon.taskmanager.presentation.api.impl.task.model.*;
import com.seiyrikon.taskmanager.presentation.api.interfaces.task.TaskApi;
import com.seiyrikon.taskmanager.shared.Principal;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/task")
    public ResponseEntity<TaskPostResponse> post(@RequestBody @Valid @NotNull TaskPostRequest request) {
        return ResponseEntity.ok(taskApi.post(request));
    }

    @PutMapping("/task")
    public ResponseEntity<TaskPutResponse> put(@RequestBody @Valid @NotNull TaskPutRequest request) {
        return ResponseEntity.ok(taskApi.put(request));
    }

    @PutMapping("/task/done")
    public ResponseEntity<TaskDoneStatusResponse> doneStatus(@RequestBody @Valid @NotNull TaskDoneStatusRequest request) {
        Principal.setId("101");
        return ResponseEntity.ok(taskApi.doneStatus(request));
    }

    @DeleteMapping("/task")
    public ResponseEntity<TaskDeleteResponse> delete(@RequestBody @Valid @NotNull TaskDeleteRequest request) {
        Principal.setId("101");
        return ResponseEntity.ok(taskApi.delete(request));
    }
}
