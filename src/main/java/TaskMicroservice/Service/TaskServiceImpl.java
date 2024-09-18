package TaskMicroservice.Service;


import TaskMicroservice.Config.PrioritizeConfig;
import TaskMicroservice.Entity.Task;
import TaskMicroservice.Exceptions.TaskNotFoundException;
import TaskMicroservice.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskServiceImpl implements TaskService{
    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private Prioritize prioritizer;

    @Override
    public List<Task> getAllTasks(String strategy) {
        List<Task> tasks = taskRepository.findAll();
        prioritizer.prioritize(tasks);
        return tasks;
    }

    @Override
    public Task getTaskById(UUID id) {
        Task savedTask = taskRepository.findById(id).orElseThrow(
                ()-> new TaskNotFoundException("Task doesn't exist!")
        );
        return savedTask;
    }

    @Override
    public Task createTask(Task task) {
        Task savedTask = taskRepository.save(task);
        return savedTask;
    }

    @Override
    public Task updateTask(UUID id, Task task) {
        Task savedTask = taskRepository.findById(id).orElseThrow(
                ()-> new TaskNotFoundException("Task doesn't exist!")
        );
        savedTask.setDescription(task.getDescription());
        savedTask.setPriority(task.getPriority());
        savedTask.setDeadline(task.getDeadline());
        taskRepository.save(savedTask);
        return savedTask;
    }

    @Override
    public Boolean deleteTask(UUID id) {
        taskRepository.deleteById(id);
        return true;
    }

}
