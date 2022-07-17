package br.com.igormedeiros.repository.opportunity;

import br.com.igormedeiros.model.opportunity.OpportunityStatusModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StatusRepository extends JpaRepository<OpportunityStatusModel, UUID> {

}
