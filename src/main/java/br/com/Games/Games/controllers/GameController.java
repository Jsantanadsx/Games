package br.com.Games.Games.controllers;

import br.com.Games.Games.models.Game;
import br.com.Games.Games.services.GameService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("games")
@Slf4j
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public List<Game> listAll(
            @RequestParam(required = false) String genre,
            @RequestParam(required = false) Integer rating,
            @RequestParam(required = false) String title

    ) {

        if (genre !=null) return service.findByGenre(genre);
        if (rating !=null) return service.findByRating(rating);
        if (title !=null) return service.findByTitle(title);

        return service.getAllGames();

    // Para teste: Método GET("Listar todos")
        // http://localhost:8080/games

    }

    @GetMapping("/page")
    public Page<Game> listPage(Pageable pageable) {
        return service.getAllPaged(pageable);

        // Para teste:
        // http://localhost:8080/games/page?page=0&size=2
        // http://localhost:8080/games/page?sort=rating,desc
    }

    @PostMapping
    public ResponseEntity<Game> createGame(@RequestBody Game game){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.addGame(game));

    // Para teste: Método Post ("Create")

        // http://localhost:8080/games

        // {
        //    "title": "Dark Souls 3",
        //    "genre": "RPG",
        //    "rating": 10,
        //    "releaseDate": "2016-03-24"
        // }
    }

    @GetMapping("{id}")
    public ResponseEntity<Game> getGameById(@PathVariable Long id){
        log.info("Obtendo dados do jogo {}", id);
        return ResponseEntity.ok(service.getGameById(id));

    // Para teste: Método Get("Por Id")
        // http://localhost:8080/games/1
    }

    @PutMapping("{id}")
    public ResponseEntity<Game> updateGame(@PathVariable Long id, @RequestBody Game game){
        log.info("Atualizando jogo com id {} com os dados {}", id, game);
        return ResponseEntity.ok(service.updateGame(id, game));

    // Para teste: Método Put("PUT")

        // http://localhost:8080/games/1

        // {
        //    "title": "Dark Souls 3",
        //    "genre": "RPG",
        //    "rating": 9,
        //    "releaseDate": "2016-03-24"
        // }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteGame(@PathVariable Long id){
        log.info("Deletando jogo com id {}", id);
        service.deleteGame(id);
        return ResponseEntity.noContent().build();

    // Para teste: Método Delete("DELETE")

        // http://localhost:8080/games/1
    }
}


// URL : http://localhost:8080/games
// URL : http://localhost:8080/h2-console
// LOGIN :
// spring.datasource.username=RiSa
// spring.datasource.password=risajava