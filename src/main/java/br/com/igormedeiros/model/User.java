package br.com.igormedeiros.model;

public class User extends Person {
  private String userName;
  private String password;

  public User(String userName, String password) {
    this.userName = userName;
    this.password = password;
  }

  public User() {}

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

  public void createCompany(Company company) {
    //TODO
  }

  public void createContact(Contact contact) {
    //TODO
  }

  public void createDeal(Deal deal) {
    //TODO
  }

  public void createStage(Deal deal, Stage stage) {
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
