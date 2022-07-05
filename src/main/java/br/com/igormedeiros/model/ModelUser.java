package br.com.igormedeiros.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name = "tb_user")

public class ModelUser implements Serializable{

  private static final long serialVersionUID = 1L;

  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column
  private String userName;
  
  @Column
  private String password;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public ModelUser(String userName, String password) {
    this.userName = userName;
    this.password = password;
  }

  public ModelUser() {}

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void createCompany(ModelCompany company) {
    //TODO
  }

  public void createContact(ModelContact contact) {
    //TODO
  }

  public void createDeal(ModelDeal deal) {
    //TODO
  }

  public void createStage(ModelDeal deal, ModelStage stage) {
    //TODO
  }

  public void createTask(String deal, String task) {}

  public void createPipeline(String name, String description) {
    //TODO
  }

  public void login(String userName, String password) {
    //TODO
  }
}
