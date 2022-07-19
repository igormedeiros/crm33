package br.com.igormedeiros.dto.opportunity;

import br.com.igormedeiros.dto.contact.ContactDTO;
import br.com.igormedeiros.dto.funnel.FunnelDTO;
import br.com.igormedeiros.dto.task.TaskDTO;
import br.com.igormedeiros.dto.user.UserDTO;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class OpportunityDTO {

    @NotBlank
    private Long id;

    @NotBlank (message = "Opportunity name is required")
    private String name;
    private String description;

    @NotBlank (message = "Contact is required")
    private ContactDTO contact;

    @NotBlank (message = "Stage is required")
    private OpportunityStageDTO stage;

    private List<TaskDTO> tasks;

    @NotBlank (message = "Status is required")
    private OpportunityStatusDTO status;

    private FunnelDTO funnel;

    private UserDTO user;


}
