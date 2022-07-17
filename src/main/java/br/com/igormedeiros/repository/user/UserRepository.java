package br.com.igormedeiros.repository.user;

import br.com.igormedeiros.model.user.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}
