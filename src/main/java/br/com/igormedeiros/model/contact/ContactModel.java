package br.com.igormedeiros.model.contact;

import br.com.igormedeiros.model.company.CompanyModel;
import br.com.igormedeiros.model.opportunity.OpportunityModel;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity(name = "tb_contacts")
public class ContactModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private CompanyModel company;

    @OneToMany(mappedBy = "contact")
    private List<ContactChannelModel> channels;

    @OneToMany(mappedBy = "contact")
    private List<OpportunityModel> opportunities;
}