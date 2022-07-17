package br.com.igormedeiros.model.opportunitie;

import br.com.igormedeiros.model.contact.ContactModel;
import br.com.igormedeiros.model.funnel.FunnelModel;
import br.com.igormedeiros.model.task.TaskModel;
import br.com.igormedeiros.model.user.UserModel;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "tb_opportunity")
public class OpportunityModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "contact_id")
    private ContactModel contact;

    @OneToOne
    private OpportunityStageModel stage;

    @OneToMany(mappedBy = "Opportunity")
    private List<TaskModel> tasks;

    @ManyToOne
    private OpportunityStatusModel status;

    @ManyToOne
    @JoinColumn(name = "funnel_id")
    private FunnelModel funnel;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user;


}
