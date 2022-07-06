package br.com.igormedeiros.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tb_deal")
public class ModelDeal implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter
  private int id;

  @Setter
  @Getter
  @Column(name = "deal_name", columnDefinition = "varchar(100)")
  private String dealName;

  @Column(name = "deal_description", columnDefinition = "varchar(250)")
  private String dealDescription;

  @Setter
  @Getter
  @Column(name = "deal_contact_id", columnDefinition = "varchar(100)")
  private int dealContactId;

  @Setter
  @Getter
  @Column(name = "deal_stage", columnDefinition = "varchar(100)")
  private String dealStage;

  @Setter
  @Getter
  @Column(name = "deal_probability_to_close", columnDefinition = "double")
  private double value;

  @Setter
  @Getter
  @Column(name = "deal_status", columnDefinition = "boolean")
  private boolean status;
}
