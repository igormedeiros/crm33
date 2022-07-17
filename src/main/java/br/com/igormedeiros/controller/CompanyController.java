package br.com.igormedeiros.controller;

import br.com.igormedeiros.model.company.CompanyModel;
import br.com.igormedeiros.repository.company.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/company")
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping(path = "/all")
    public List<CompanyModel> getCompanies() {
        return companyRepository.findAll();
    }

    @PostMapping(path = "/new")
    public void addCompany(@RequestBody CompanyModel companyModel) {
        companyRepository.save(companyModel);
    }
}
