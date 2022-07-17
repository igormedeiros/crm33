package br.com.igormedeiros.controller;

import br.com.igormedeiros.model.company.CompanyModel;
import br.com.igormedeiros.model.contact.ContactModel;
import br.com.igormedeiros.model.funnel.FunnelModel;
import br.com.igormedeiros.repository.company.CompanyRepository;
import br.com.igormedeiros.repository.contact.ContactRepository;
import br.com.igormedeiros.repository.funnel.FunnelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funnel")

public class Funnel33Controller {


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

}
