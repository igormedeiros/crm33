package br.com.igormedeiros.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tb_contact")
public class ModelContact implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int id;

  @Getter
  @Setter
  @Column(name = "contact_name", columnDefinition = "varchar(100)")
  private String firstName;

  @Getter @Setter
  @Column (name = "contact_last_name", columnDefinition = "varchar(100)")
  private String lastName;

  @Getter
  @Setter
  @Column (name = "contact_email", columnDefinition = "varchar(250)")
  private String email;

  @Column (name = "contact_phone", columnDefinition = "varchar(20)")
  private String phone;
}
