package br.com.igormedeiros.repository.opportunity;

import br.com.igormedeiros.model.opportunity.OpportunityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface OpportunityRepository extends JpaRepository<OpportunityModel, UUID> {

}
