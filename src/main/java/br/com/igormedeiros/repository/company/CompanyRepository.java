package br.com.igormedeiros.repository.company;

import br.com.igormedeiros.model.company.CompanyModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyRepository extends JpaRepository<CompanyModel, UUID> {

}
