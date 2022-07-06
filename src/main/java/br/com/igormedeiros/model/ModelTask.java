package br.com.igormedeiros.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tb_task")
public class ModelTask implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Getter
  private int id;

  @Getter
  @Setter
  @Column(name = "task_name", columnDefinition = "VARCHAR(100)")
  private String name;

  @Getter
  @Setter
  @Column(name = "task_date", columnDefinition = "DATE")
  private Date date;

  @Getter
  @Setter
  @Column(name = "task_notes", columnDefinition = "VARCHAR(500)")
  private String notes;

  @Getter
  @Setter
  @Column(name = "task_status", columnDefinition = "BOOLEAN")
  private boolean status;

  @Getter
  @Setter
  @Column(name = "task_type", columnDefinition = "varchar(50)")
  private String type;

  @Getter
  @Setter
  @Column(name = "task_priority", columnDefinition = "INTEGER")
  private int priority;

  @Getter
  @Setter
  @Column(name = "task_assignee", columnDefinition = "DOUBLE")
  private String assignee;
}
