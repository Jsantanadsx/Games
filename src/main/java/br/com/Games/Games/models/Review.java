package br.com.Games.Games.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int score;
    private String comment;

    // relacionamento com Game
    @ManyToOne
    private Game game;

    // relacionamento com User
    @ManyToOne
    private User user;
}
