package br.com.igormedeiros.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tb_stage")
public class ModelStage implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Getter
  private int id;

  @Getter
  @Setter
  @Column(name = "stage_name", columnDefinition = "varchar(100)")
  private String name;

  @Getter
  @Setter
  @Column(name = "stage_probability_to_close", columnDefinition = "double")
  private double probabilityToClose;
}