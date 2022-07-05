package br.com.igormedeiros.model;

import java.util.ArrayList;

@Entity (tableName = "tb_pipeline")
public class ModelPipeline {
    
  private String name;
  private String description;
  private Deal deal;
  private ArrayList<Stage> stages;

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

  public Deal getDeal() {
    return deal;
  }

  public void setDeal(Deal deal) {
    this.deal = deal;
  }

  public ArrayList<Stage> getStages() {
    return stages;
  }

  public void setStages(ArrayList<Stage> stages) {
    this.stages = stages;
  }
}
