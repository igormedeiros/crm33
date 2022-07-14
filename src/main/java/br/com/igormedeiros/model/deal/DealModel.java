package br.com.igormedeiros.model.deal;

import br.com.igormedeiros.model.system.PipelineModel;
import br.com.igormedeiros.model.contact.ContactModel;
import br.com.igormedeiros.model.deal.task.TaskModel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@Entity(name = "tb_deals")
public class DealModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "contact_id")
    private ContactModel contact;

    @OneToMany(mappedBy = "deal")
    private List<TaskModel> tasks;

    @OneToOne
    private DealStageModel stage;

    private DealStatusModel status;

    @ManyToOne
    @JoinColumn(name = "pipeline_id")
    private PipelineModel pipeline;

}
