package br.com.igormedeiros.repository.task;

import br.com.igormedeiros.model.task.TaskPriorityModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TaskPriorityRepository extends JpaRepository<TaskPriorityModel, UUID> {

}
