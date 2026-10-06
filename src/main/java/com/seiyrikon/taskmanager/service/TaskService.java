package com.seiyrikon.taskmanager.service;

import com.seiyrikon.taskmanager.model.dto.task.TaskResponseDto;
import com.seiyrikon.taskmanager.infrastracture.repository.dbaccess.tables.interfaces.TaskRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    @Cacheable("tasks")
    public List<TaskResponseDto> getAllTask() {
        return repository.findAll()
                .stream()
                .map(task -> new TaskResponseDto(
                        task.getName(),
                        task.getDescription(),
                        task.getStatus()
                ))
                .toList();
    }
}
