package br.com.igormedeiros.repository.contact;

import br.com.igormedeiros.model.contact.ContactModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContactRepository extends JpaRepository<ContactModel, UUID> {

}
