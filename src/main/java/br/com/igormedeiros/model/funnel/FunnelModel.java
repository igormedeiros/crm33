package br.com.igormedeiros.model.funnel;

import br.com.igormedeiros.model.opportunity.OpportunityModel;
import br.com.igormedeiros.model.user.UserModel;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
@Entity(name = "tb_funnels")
public class FunnelModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String description;

    @OneToMany(mappedBy = "funnel")
    private List<UserModel> users;

    @OneToMany(mappedBy = "funnel")
    private List<OpportunityModel> opportunities;
}
