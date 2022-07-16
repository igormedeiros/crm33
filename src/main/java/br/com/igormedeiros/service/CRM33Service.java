package br.com.igormedeiros.service;

import br.com.igormedeiros.repository.PipelineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CRM33Service {
    @Autowired
    PipelineRepository pipelineRepository;
}
