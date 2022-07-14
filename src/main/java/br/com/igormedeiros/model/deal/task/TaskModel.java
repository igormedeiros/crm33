package br.com.igormedeiros.model.deal.task;

import br.com.igormedeiros.model.contact.ContactModel;
import br.com.igormedeiros.model.deal.DealModel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity(name = "tb_tasks")
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "assignee_contact_id")
    private ContactModel assigneeContact;

    private String notes;

    @ManyToOne
    @JoinColumn(name = "priority_id")
    private TaskPriorityModel priority;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private TaskTypeModel type;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private TaskStatusModel status;

    private Date deadLine;

    @ManyToOne
    @JoinColumn(name = "deal_id")
    private DealModel deal;


}
