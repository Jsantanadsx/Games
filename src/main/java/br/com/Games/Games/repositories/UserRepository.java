package br.com.Games.Games.repositories;

import br.com.Games.Games.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
