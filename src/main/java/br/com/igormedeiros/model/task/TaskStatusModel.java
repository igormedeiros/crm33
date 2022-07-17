package br.com.igormedeiros.model.task;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity(name = "tb_task_statuses")
public class TaskStatusModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "status")
    private List<TaskModel> tasks;

}
