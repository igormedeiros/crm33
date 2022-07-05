package br.com.igormedeiros.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name= "tb_contact")
public class ModelContact implements Serializable {

    @Id
    private int id;

    private static final long serialVersionUID = 1L;


}
