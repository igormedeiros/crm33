package br.com.igormedeiros.dto.task;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class TaskStatusDTO {

    @NotBlank
    private Long id;

    @NotBlank (message = "Task status name is required")
    private String name;
    private String description;
    private List<TaskDTO> tasks;

}
