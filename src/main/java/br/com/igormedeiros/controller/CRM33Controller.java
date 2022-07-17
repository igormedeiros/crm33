package br.com.igormedeiros.controller;

import br.com.igormedeiros.model.funnel.FunnelModel;
import br.com.igormedeiros.repository.FunnelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crm33")

public class CRM33Controller {


    @Autowired
    private FunnelRepository funnelRepository;

    @GetMapping(path = "api/status")
    public String checkStatus() {
        return "API running";
    }

    @GetMapping(path = "/main")
    public List<FunnelModel> getPipelines() {
        return funnelRepository.findAll();
    }

    @PostMapping(path = "/main/new")
    public void addPipeline(@RequestBody FunnelModel pipelineModel) {
        funnelRepository.save(pipelineModel);
    }

}
