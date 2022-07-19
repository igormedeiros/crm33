package br.com.igormedeiros.model.contact;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "tb_contact_channels")
public class ContactChannelModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String type;
    private String value;

    @ManyToOne
    @JoinColumn(name = "contact_id")
    private ContactModel contact;
}
