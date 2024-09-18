package TaskMicroservice.Service;

import TaskMicroservice.Entity.Task;
import org.springframework.stereotype.Component;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


@Component
public class DeadlinePrioritizer implements Prioritize{
    @Override
    public List<Task> prioritize(List<Task> tasks) {
        // Sort tasks by deadline in ascending order (earliest deadline first)
        Collections.sort(tasks, new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                // Comparing Instant objects
                return t1.getDeadline().compareTo(t2.getDeadline());
            }
        });
        return tasks;
    }
}
