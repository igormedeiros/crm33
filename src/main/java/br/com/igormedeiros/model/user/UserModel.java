package br.com.igormedeiros.model.user;

import br.com.igormedeiros.model.funnel.FunnelModel;
import br.com.igormedeiros.model.opportunitie.OpportunityModel;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;

    @OneToOne
    private UserRoleModel role;

    @ManyToOne
    @JoinColumn(name = "funnel_id")
    private FunnelModel funnel;

    @OneToMany(mappedBy = "user")
    private List<OpportunityModel> deals;

}
