package br.com.igormedeiros.model;

import java.util.Date;

@Entity (tableName = "tb_task")
public class ModelTask {

  private String name;
  private Date date;
  private String notes;
  private String channel;
  private boolean status;
  private String type;
  private int priority;
  private User assignee;
  
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
public User getAssignee() {
    return assignee;
}
public void setAssignee(User assignee) {
    this.assignee = assignee;
}
}
