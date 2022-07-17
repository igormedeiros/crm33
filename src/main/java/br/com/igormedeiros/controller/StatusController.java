package br.com.igormedeiros.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {
    @GetMapping(path = "/")
    public String getStatus() {
        return "API running";
    }
}
