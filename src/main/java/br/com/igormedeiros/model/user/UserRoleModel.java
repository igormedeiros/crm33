package br.com.igormedeiros.model.user;

import javax.persistence.*;
import java.util.UUID;

@Entity(name = "tb_user_roles")
public class UserRoleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserModel user;
}
