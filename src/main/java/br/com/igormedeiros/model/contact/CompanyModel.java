package br.com.igormedeiros.model.contact;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "tb_companies")
public class CompanyModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String name;
        private String description;
        private String phone;
        private String webSite;

        @OneToMany(mappedBy = "company")
        private List<ContactModel> contacts;



}
