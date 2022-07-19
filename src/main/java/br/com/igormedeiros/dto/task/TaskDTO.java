package br.com.igormedeiros.dto.task;

import br.com.igormedeiros.dto.opportunity.OpportunityDTO;
import br.com.igormedeiros.dto.user.UserDTO;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class TaskDTO {

    @NotBlank
    private Long id;

    @NotBlank (message = "Task name is required")
    private String name;
    private String description;

    @NotBlank (message = "Task type is required")
    private TaskTypeDTO type;

    private String notes;

    private TaskPriorityDTO priority;

    private TaskStatusDTO status;
    @NotBlank (message = "Due Date is required")
    private LocalDateTime dueDate;

    private OpportunityDTO opportunity;

    private UserDTO user;


}
