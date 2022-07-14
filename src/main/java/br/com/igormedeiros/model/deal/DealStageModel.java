package br.com.igormedeiros.model.deal;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "tb_stages")
public class DealStageModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private double probabilityToWin;

    @OneToOne
    @JoinColumn(name = "deal_id")
    private DealModel deal;
}
