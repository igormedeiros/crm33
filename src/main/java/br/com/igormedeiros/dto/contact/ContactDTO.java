package br.com.igormedeiros.dto.contact;

import br.com.igormedeiros.dto.company.CompanyDTO;
import br.com.igormedeiros.dto.opportunity.OpportunityDTO;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class ContactDTO {

    @NotBlank
    private Long id;

    @NotBlank (message = "Contact name is required")
    private String firstName;
    private String lastName;

    private CompanyDTO company;

    private List<ContactChannelDTO> channels;

    private List<OpportunityDTO> opportunities;
}