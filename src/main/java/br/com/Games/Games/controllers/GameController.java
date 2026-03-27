package br.com.Games.Games.controllers;

import br.com.Games.Games.models.Game;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("games")
@Slf4j
public class GameController {

    private static final Logger log = LoggerFactory.getLogger(GameController.class);
    @Autowired
    private GameService service;

    @GetMapping
    public List<Game> listAll() {
        return service.getAllGames();
    }

    @PostMapping
    public ResponseEntity<Game> createGame(@RequestBody Game game){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.addGame(game));
    }

    @GetMapping("{id}")
    public ResponseEntity<Game> getGameById(@PathVariable Long id){
        log.info("Obtendo dados do jogo {}", id);
        return ResponseEntity.ok(service.getGameById(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteGame(@PathVariable Long id){
        log.info("Deletando jogo com id {}", id);
        service.deleteGame(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Game> updateGame(@PathVariable Long id, @RequestBody Game game){
        log.info("Atualizando jogo com id {} com os dados {}", id, game);
        return ResponseEntity.ok( service.updateGame(id, game));
    }
}
//pq ta tudo errado???