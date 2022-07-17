package br.com.igormedeiros.repository.task;

import br.com.igormedeiros.model.task.TaskStatusModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TaskStatusRepository extends JpaRepository<TaskStatusModel, UUID> {

}
