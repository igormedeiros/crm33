package br.com.igormedeiros.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tb_stage")
public class ModelStage implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int id;

  @Column(name = "stage_name", columnDefinition = "varchar(100)")
  private String name;

  @Column(name = "stage_probability_to_close", columnDefinition = "double")
  private double probabilityToClose;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getProbabilityToClose() {
    return probabilityToClose;
  }

  public void setProbabilityToClose(double probabilityToClose) {
    this.probabilityToClose = probabilityToClose;
  }
}
