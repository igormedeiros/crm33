package br.com.igormedeiros.model.deal.task;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "tb_task_priorities")
public class TaskPriorityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String priority; // 0 to 5, where 5 is the highest priority and 0 is the lowest priority

    @OneToMany(mappedBy = "priority")
    private List<TaskModel> tasks;

}
