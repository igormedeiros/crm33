package br.com.igormedeiros.model.deal.task;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "tb_task_statuses")
public class TaskStatusModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "status")
    private List<TaskModel> tasks;

}
