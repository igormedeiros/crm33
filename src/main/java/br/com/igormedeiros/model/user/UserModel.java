package br.com.igormedeiros.model.user;

import br.com.igormedeiros.model.funnel.FunnelModel;
import br.com.igormedeiros.model.opportunitie.OpportunityModel;
import br.com.igormedeiros.model.task.TaskModel;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

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

    @OneToMany(mappedBy = "user")
    private List<TaskModel> tasks;

}