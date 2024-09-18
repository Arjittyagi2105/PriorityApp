package TaskMicroservice.Service;

import TaskMicroservice.Entity.Task;

import java.util.List;

public interface Prioritize {
    List<Task> prioritize(List<Task> tasks);
}
