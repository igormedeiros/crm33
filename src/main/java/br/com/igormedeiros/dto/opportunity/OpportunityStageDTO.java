package br.com.igormedeiros.dto.opportunity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
public class OpportunityStageDTO {
    @NotBlank
    private Long id;

    @NotBlank (message = "Opportunity stage name is required")
    private String name;
    private String description;
    private double probabilityToWin;

    private OpportunityDTO opportunity;
}
