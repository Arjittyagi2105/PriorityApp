package TaskMicroservice.DTO;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionResponseDTO {
    String description;
    int code;
}
