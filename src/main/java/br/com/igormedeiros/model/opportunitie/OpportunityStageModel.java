package br.com.igormedeiros.model.opportunitie;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "tb_stages")
public class OpportunityStageModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private double probabilityToWin;

    @OneToOne
    @JoinColumn(name = "opportunity_id")
    private OpportunityModel opportunity;
}
