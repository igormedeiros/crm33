package br.com.igormedeiros.dto.user;

import br.com.igormedeiros.dto.funnel.FunnelDTO;
import br.com.igormedeiros.dto.opportunity.OpportunityDTO;
import br.com.igormedeiros.dto.task.TaskDTO;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class UserDTO {

    @NotBlank
    private Long id;

    @NotBlank (message = "User name is required")
    private String firstName;
    private String lastName;

    @NotBlank (message = "User's username is required")
    private String username;

    @NotBlank (message = "User email is required")
    private String email;

    @NotBlank (message = "User password is required")
    private String password;

    @NotBlank (message = "User role is required")
    private UserRoleDTO role;

    private FunnelDTO funnel;

    private List<OpportunityDTO> deals;

    private List<TaskDTO> tasks;

}
