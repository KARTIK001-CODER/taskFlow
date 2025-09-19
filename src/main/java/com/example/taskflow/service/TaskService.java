package com.example.taskflow.service;

import com.example.taskflow.model.Task;
import java.util.List;
import java.util.Optional;

public interface TaskService {
    Task createTask(Task task);
    List<Task> getAllTasks();
    Optional<Task> getTaskById(Long id);
    Task updateTask(Long id, Task taskDetails);
    void deleteTask(Long id);
}
