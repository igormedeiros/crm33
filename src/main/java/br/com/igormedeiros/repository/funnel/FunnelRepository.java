package br.com.igormedeiros.repository.funnel;

import br.com.igormedeiros.model.funnel.FunnelModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FunnelRepository extends JpaRepository<FunnelModel, Long> {

}
