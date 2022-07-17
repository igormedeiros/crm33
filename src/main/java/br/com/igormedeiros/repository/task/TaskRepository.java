package br.com.igormedeiros.repository.task;

import br.com.igormedeiros.model.company.CompanyModel;
import br.com.igormedeiros.model.task.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TaskRepository extends JpaRepository<TaskModel, UUID> {

}
