package br.com.igormedeiros.dto.funnel;

import br.com.igormedeiros.dto.opportunity.OpportunityDTO;
import br.com.igormedeiros.dto.user.UserDTO;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@Data
public class FunnelDTO implements Serializable {

    @NotBlank
    private Long id;

    @NotBlank (message = "Funnel name is required")
    private String name;
    private String description;

    private List<UserDTO> users;

    private List<OpportunityDTO> opportunities;
}
