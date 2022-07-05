package br.com.igormedeiros.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tb_task")
public class ModelTask implements Serializable{

  private static final long serialVersionUID = 1L;
  
  @Id
  private int id;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  private String name;
  private Date date;
  private String notes;
  private String channel;
  private boolean status;
  private String type;
  private int priority;
  private ModelUser assignee;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getPriority() {
    return priority;
  }

  public void setPriority(int priority) {
    this.priority = priority;
  }

  public ModelUser getAssignee() {
    return assignee;
  }

  public void setAssignee(ModelUser assignee) {
    this.assignee = assignee;
  }
}
