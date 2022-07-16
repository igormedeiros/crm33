package br.com.igormedeiros.controller;

import br.com.igormedeiros.model.system.PipelineModel;
import br.com.igormedeiros.repository.PipelineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crm33")

public class CRM33Controller {


    @Autowired
    private PipelineRepository pipelineRepository;

    @GetMapping(path = "api/status")
    public String checkStatus() {
        return "API running";
    }

    @GetMapping(path = "/pipelines")
    public List<PipelineModel> getPipelines() {
        return pipelineRepository.findAll();
    }

    @PostMapping(path = "/pipelines/new")
    public void addPipeline(@RequestBody PipelineModel pipelineModel) {
        pipelineRepository.save(pipelineModel);
    }

}
