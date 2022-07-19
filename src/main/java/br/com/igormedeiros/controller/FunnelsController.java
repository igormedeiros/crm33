package br.com.igormedeiros.controller;

import br.com.igormedeiros.model.funnel.FunnelModel;
import br.com.igormedeiros.repository.funnel.FunnelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funnel")

public class FunnelsController {


    @Autowired
    private FunnelRepository funnelRepository;

    @GetMapping(path = "/funnels")
    public List<FunnelModel> getFunnels() {
        return funnelRepository.findAll();
    }

    @PostMapping(path = "/funnels/new")
    public void addPipeline(@RequestBody FunnelModel funnelModel) {
        funnelRepository.save(funnelModel);
    }

    // TODO: get one funnel
    // TODO: update one funnel
    // TODO: delete one funnel
    // TODO: add stage to a funnel
    // TODO: remove stage from a funnel

}
