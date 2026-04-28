package br.com.Games.Games.repositories;

import br.com.Games.Games.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {

    List<Game> findByGenre(String genre);

    List<Game> findByRating(int rating);

    List<Game> findByTitleContainingIgnoreCase(String title);

}
