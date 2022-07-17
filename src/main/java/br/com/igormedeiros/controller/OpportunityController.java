package br.com.igormedeiros.controller;

import br.com.igormedeiros.model.opportunity.OpportunityModel;
import br.com.igormedeiros.repository.opportunity.OpportunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/opportunity")
public class OpportunityController {

    @Autowired
    private OpportunityRepository opportunityRepository;

    @GetMapping(path = "/all")
    public List<OpportunityModel> getOpportunities() {
        return opportunityRepository.findAll();
    }
    @PostMapping(path = "/new")
    public void addOpportunity(@RequestBody OpportunityModel opportunityModel) {
        opportunityRepository.save(opportunityModel);
    }

}
