package br.com.Games.Games.repositories;

import br.com.Games.Games.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
