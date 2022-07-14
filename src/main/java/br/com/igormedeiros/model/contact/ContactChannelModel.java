package br.com.igormedeiros.model.contact;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity(name = "tb_contact_channels")
public class ContactChannelModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String type;
        private String value;

        @ManyToOne
        @JoinColumn(name = "contact_id")
        private ContactModel contact;



}
