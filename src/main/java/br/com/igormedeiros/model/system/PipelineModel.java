package br.com.igormedeiros.model.system;

import br.com.igormedeiros.model.deal.DealModel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity(name = "tb_pipelines")
public class PipelineModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;

    @OneToMany(mappedBy = "pipeline")
    private List<UserModel> user;

    @OneToMany (mappedBy = "pipeline")
    private List<DealModel> deals;



}
