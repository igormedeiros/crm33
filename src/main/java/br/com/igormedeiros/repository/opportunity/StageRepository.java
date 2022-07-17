package br.com.igormedeiros.repository.opportunity;

import br.com.igormedeiros.model.opportunity.OpportunityStageModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StageRepository extends JpaRepository<OpportunityStageModel, UUID> {

}
