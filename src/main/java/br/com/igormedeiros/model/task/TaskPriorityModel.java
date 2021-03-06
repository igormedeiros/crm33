package br.com.igormedeiros.model.task;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "tb_task_priorities")
public class TaskPriorityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private int priority; // 0 to 5, where 5 is the highest priority and 0 is the lowest priority

    @OneToMany(mappedBy = "priority")
    private List<TaskModel> tasks;

}
