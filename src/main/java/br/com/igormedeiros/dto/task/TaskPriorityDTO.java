package br.com.igormedeiros.dto.task;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class TaskPriorityDTO {
    @NotBlank
    private Long id;
    @NotBlank(message = "Task priority name is required")
    private String name;
    private String description;

    @NotBlank(message = "Task priority is required")
    private int priority; // 0 to 5, where 5 is the highest priority and 0 is the lowest priority

    private List<TaskDTO> tasks;

}
