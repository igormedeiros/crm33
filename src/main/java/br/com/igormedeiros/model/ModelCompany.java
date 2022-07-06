package br.com.igormedeiros.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tb_company")
public class ModelCompany implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter
  private int id;

  @Getter
  @Setter
  @Column(name = "company_name", columnDefinition = "varchar(100)")
  private String name;

  @Setter
  @Getter
  @Column(name = "company_address", columnDefinition = "varchar(500)")
  private String address;

  @Getter
  @Setter
  @Column(name = "company_website", columnDefinition = "varchar(250)")
  private String website;

  @Getter
  @Setter
  @Column (name = "company_phone", columnDefinition = "varchar(20)")
  private String phone;
}
