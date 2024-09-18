package TaskMicroservice.Entity;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity(name = "tasks")
public class Task extends BaseModel{
    private String Description;
    private String Priority;
    private Instant Deadline;
    private String Category;
}
