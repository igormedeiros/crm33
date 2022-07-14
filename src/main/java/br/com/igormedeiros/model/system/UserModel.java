package br.com.igormedeiros.model.system;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;
    private String password;
    private String role;

    @ManyToOne
    @JoinColumn(name = "pipeline_id")
    private PipelineModel pipeline;
}
