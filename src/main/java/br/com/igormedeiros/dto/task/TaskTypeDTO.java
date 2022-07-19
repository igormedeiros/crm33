package br.com.igormedeiros.dto.task;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class TaskTypeDTO {
    @NotBlank
    private Long id;
    @NotBlank (message = "Task type name is required")
    private String name;
    private String description;

    private List<TaskDTO> tasks;
}
