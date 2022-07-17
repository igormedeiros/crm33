package br.com.igormedeiros.model.contact;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity(name = "tb_companies")
public class CompanyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;
    private String description;
    private String phone;
    private String webSite;

    @OneToMany(mappedBy = "company")
    private List<ContactModel> contacts;
}
