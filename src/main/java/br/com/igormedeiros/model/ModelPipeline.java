package br.com.igormedeiros.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tb_pipeline")
public class ModelPipeline {
  private static final long serialVersionUID = 1L;

  @Id
  private int id;

  @Column(name = "pipeline_name", columnDefinition = "varchar(100)")
  private String name;

  @Column(name = "pipeline_description", columnDefinition = "varchar(500)")
  private String description;

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
}
