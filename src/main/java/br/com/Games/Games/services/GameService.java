package br.com.Games.Games.services;

import br.com.Games.Games.models.Game;
import br.com.Games.Games.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<Game> getAllGames() {
        return repository.findAll();
    }

    public Game addGame(Game game) {
        return repository.save(game);
    }

    private Game findGameById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Jogo não encontrado"));
    }

    public Game getGameById(Long id) {
        return findGameById(id);
    }

    public void deleteGame(Long id) {
        findGameById(id);
        repository.deleteById(id);
    }

    public Game updateGame(Long id, Game newGame){
        Game existing = findGameById(id);

        existing.setTitle(newGame.getTitle());
        existing.setGenre(newGame.getGenre());
        existing.setRating(newGame.getRating());
        existing.setReleaseDate(newGame.getReleaseDate());

        return repository.save(existing);
    }
}