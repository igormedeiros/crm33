package br.com.igormedeiros.dto.opportunity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class OpportunityStatusDTO implements Serializable {

    @NotBlank
    private Long id;

    @NotBlank(message = "Opportunity status name is required")
    private String name;
    private String description;

    private OpportunityDTO opportunity;
}
