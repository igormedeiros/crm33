package br.com.igormedeiros.model;

public class UserAdmin extends User {

  public User createUser(String userName, String password) {
    return new User(userName, password);
  }
}
