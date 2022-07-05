package br.com.igormedeiros.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name = "tb_pipeline")

public class ModelPipeline implements Serializable{

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private int id;

  @Column
  private String name;
  
  @Column
  private String description;
  
  @Column
  private ModelDeal deal;
  
  @Column
  private ArrayList<ModelStage> stages;

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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ModelDeal getDeal() {
    return deal;
  }

  public void setDeal(ModelDeal deal) {
    this.deal = deal;
  }

  public ArrayList<ModelStage> getStages() {
    return stages;
  }

  public void setStages(ArrayList<ModelStage> stages) {
    this.stages = stages;
  }
}
