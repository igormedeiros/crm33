package br.com.igormedeiros.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tb_task")
public class ModelTask implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int id;

  @Column(name = "task_name", columnDefinition = "VARCHAR(100)")
  private String name;

  @Column(name = "task_date", columnDefinition = "DATE")
  private Date date;

  @Column(name = "task_notes", columnDefinition = "VARCHAR(500)")
  private String notes;

  @Column(name = "task_status", columnDefinition = "BOOLEAN")
  private boolean status;

  @Column(name = "task_type", columnDefinition = "varchar(50)")
  private String type;

  @Column(name = "task_priority", columnDefinition = "Integer")
  private int priority;

  @Column(name = "task_assignee", columnDefinition = "double")
  private String assignee;

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

  public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  
}
