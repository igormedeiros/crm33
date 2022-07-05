package br.com.igormedeiros.model;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tb_deal")
public class ModelDeal implements Serializable{

  private static final long serialVersionUID = 1L;

  @Id
  private int id;

  private ModelContact contact;
  private ModelStage stage;
  private double value;
  private boolean status;
  private ArrayList<ModelTask> tasks;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public ModelContact getContact() {
    return contact;
  }

  public void setContact(ModelContact contact) {
    this.contact = contact;
  }

  public ModelStage getStage() {
    return stage;
  }

  public void setStage(ModelStage stage) {
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

  public ArrayList<ModelTask> getTasks() {
    return tasks;
  }
}
