package br.com.Games.Games.repositories;

import br.com.Games.Games.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
