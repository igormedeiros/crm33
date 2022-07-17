package br.com.igormedeiros.model.task;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity(name = "tb_task_types")
public class TaskTypeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "type")
    private List<TaskModel> tasks;
}
