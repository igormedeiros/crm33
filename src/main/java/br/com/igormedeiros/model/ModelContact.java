package br.com.igormedeiros.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tb_contact")
public class ModelContact implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int id;

  @Column(name = "contact_name", columnDefinition = "varchar(100)")
  private String firstName;

  @Column(name = "contact_last_name", columnDefinition = "varchar(100)")
  private String lastName;

  @Column(name = "contact_email", columnDefinition = "varchar(250)")
  private String email;

  @Column(name = "contact_phone", columnDefinition = "varchar(20)")
  private String phone;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
