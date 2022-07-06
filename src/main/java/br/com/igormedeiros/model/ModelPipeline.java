package br.com.igormedeiros.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity (name = "tb_pipeline")

public class ModelPipeline implements Serializable{

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  @Getter
  private int id;

  @Getter
  @Setter
  @Column (name = "pipeline_name", columnDefinition = "varchar(100)")
  private String name;
  
  @Getter
  @Setter
  @Column (name = "pipeline_description", columnDefinition = "varchar(500)")
  private String description;
}
