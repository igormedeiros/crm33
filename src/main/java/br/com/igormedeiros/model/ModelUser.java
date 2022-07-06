package br.com.igormedeiros.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tb_user")
public class ModelUser implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter private int id;

  @Getter
  @Setter
  @Column(name = "crm_user_name", columnDefinition = "varchar(100)")
  private String userName;

  @Getter
  @Setter
  @Column(name = "crm_user_password", columnDefinition = "password")
  private String password;
}
