package br.com.igormedeiros.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "tb_deal")
public class ModelDeal implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  

  @Column(name = "deal_name", columnDefinition = "varchar(100)")
  private String dealName;
  
 
  @Column (name = "deal_description", columnDefinition = "varchar(500)")
  private String dealDescription;
  
  @Column (name = "deal_contact_id", columnDefinition = "Integer")
  private int dealContactId;

  @Column (name = "deal_stage_id", columnDefinition = "Integer")
  private int dealStage;
  
  @Column (name = "deal_value", columnDefinition = "double")
  private double value;

  @Column
  private boolean status;

  public int getId() {
    return id;
  }

  public String getDealName() {
    return dealName;
  }

  public void setDealName(String dealName) {
    this.dealName = dealName;
  }

  public String getDealDescription() {
    return dealDescription;
  }

  public void setDealDescription(String dealDescription) {
    this.dealDescription = dealDescription;
  }

  public int getDealContactId() {
    return dealContactId;
  }

  public void setDealContactId(int dealContactId) {
    this.dealContactId = dealContactId;
  }

  public int getDealStage() {
    return dealStage;
  }

  public void setDealStage(int dealStage) {
    this.dealStage = dealStage;
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

  

}
