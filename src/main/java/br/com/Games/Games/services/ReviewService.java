package br.com.Games.Games.services;

import br.com.Games.Games.models.Game;
import br.com.Games.Games.models.Review;
import br.com.Games.Games.models.User;
import br.com.Games.Games.repositories.GameRepository;
import br.com.Games.Games.repositories.ReviewRepository;
import br.com.Games.Games.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository repository;

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Review> getAll() {
        return repository.findAll();
    }

    public Review create(Review review) {

        Game game = gameRepository.findById(review.getGame().getId())
                .orElseThrow(() -> new RuntimeException("Game não encontrado"));

        User user = userRepository.findById(review.getUser().getId())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        review.setGame(game);
        review.setUser(user);

        return repository.save(review);
    }

    public Review getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Review não encontrada"));
    }

    public void delete(Long id) {
        Review review = getById(id);
        repository.delete(review);
    }
}