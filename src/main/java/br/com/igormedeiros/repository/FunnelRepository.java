package br.com.igormedeiros.repository;

import br.com.igormedeiros.model.funnel.FunnelModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FunnelRepository extends JpaRepository<FunnelModel, Long> {

}
