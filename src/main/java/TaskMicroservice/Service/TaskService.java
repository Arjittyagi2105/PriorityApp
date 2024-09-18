package TaskMicroservice.Service;

import TaskMicroservice.Config.PrioritizeConfig;
import TaskMicroservice.Entity.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {
    List<Task> getAllTasks(String strategy);
    Task getTaskById(UUID id);
    Task createTask(Task task);
    Task updateTask(UUID id,Task task);
    Boolean deleteTask(UUID id);

}
