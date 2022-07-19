package br.com.igormedeiros.controller;

import br.com.igormedeiros.model.task.TaskModel;
import br.com.igormedeiros.repository.task.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funnel33/task")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping(path = "/all")
    public List<TaskModel> getTasks() {
        return taskRepository.findAll();
    }

    // TODO: get one Task
    // TODO: update one Task
    // TODO: delete one Task

    @PostMapping(path = "/new")
    public void addTask(@RequestBody TaskModel taskModel) {
        taskRepository.save(taskModel);
    }

}
