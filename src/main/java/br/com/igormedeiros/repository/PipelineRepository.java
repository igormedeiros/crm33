package br.com.igormedeiros.repository;

import br.com.igormedeiros.model.system.PipelineModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PipelineRepository extends JpaRepository<PipelineModel, UUID> {

}
