package br.com.igormedeiros.model.opportunity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Data
@Entity(name = "tb_opportunity_statuses")
public class OpportunityStatusModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

    @OneToOne
    private OpportunityModel opportunity;
}
