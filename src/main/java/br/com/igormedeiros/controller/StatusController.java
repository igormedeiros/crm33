package br.com.igormedeiros.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping(path = "api/status")
    public String checkStatus() {
        return "API running";
    }

}
