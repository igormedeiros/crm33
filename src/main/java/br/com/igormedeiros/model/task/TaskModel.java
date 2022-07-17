package br.com.igormedeiros.model.task;

import br.com.igormedeiros.model.opportunity.OpportunityModel;
import br.com.igormedeiros.model.user.UserModel;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Data
@Entity(name = "tb_tasks")
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private TaskTypeModel type;

    private String notes;

    @ManyToOne
    @JoinColumn(name = "priority_id")
    private TaskPriorityModel priority;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private TaskStatusModel status;

    private Date deadLine;

    @ManyToOne
    @JoinColumn(name = "Opportunity_id")
    private OpportunityModel opportunity;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user;


}
