package TaskMicroservice.Controller;


import TaskMicroservice.Config.PrioritizeConfig;
import TaskMicroservice.Entity.Task;
import TaskMicroservice.Service.Prioritize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import TaskMicroservice.Service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;


    @GetMapping()
    public ResponseEntity getAllTasks(@RequestParam String strategy) {
        List<Task> tasks = taskService.getAllTasks(strategy);
        return ResponseEntity.ok(tasks);
    }

    @PostMapping
    public ResponseEntity createTask(@RequestBody Task task) {
        Task createdTask = taskService.createTask(task);
        return ResponseEntity.ok(createdTask);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateTask(@PathVariable UUID id, @RequestBody Task updatedTask) {
        return ResponseEntity.ok(taskService.updateTask(id,updatedTask));
    }

    @GetMapping("/{id}")
    public ResponseEntity GetTask(@PathVariable UUID id) {
        return ResponseEntity.ok(taskService.getTaskById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity DeleteTask(@PathVariable UUID id) {
        return ResponseEntity.ok(taskService.deleteTask(id));
    }
}
