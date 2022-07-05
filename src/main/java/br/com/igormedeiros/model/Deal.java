package br.com.igormedeiros.model;

import java.util.ArrayList;

public class Deal {
    
  private Contact contact;
  private Stage stage;
  private double value;
  private boolean status;
  private ArrayList<Task> tasks;

  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public Stage getStage() {
    return stage;
  }

  public void setStage(Stage stage) {
    this.stage = stage;
  }

  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public ArrayList<Task> getTasks() {
    return tasks;
  }

}
