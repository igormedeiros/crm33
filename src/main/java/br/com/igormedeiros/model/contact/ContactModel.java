package br.com.igormedeiros.model.contact;

import br.com.igormedeiros.model.deal.DealModel;
import br.com.igormedeiros.model.deal.task.TaskModel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "tb_contacts")
public class ContactModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private CompanyModel company;

    @OneToMany (mappedBy = "contact")
    private List<ContactChannelModel> channels;

    @OneToMany (mappedBy = "contact")
    private List<DealModel> deals;

    @OneToMany (mappedBy = "assigneeContact")
    private List<TaskModel> tasks;
}
