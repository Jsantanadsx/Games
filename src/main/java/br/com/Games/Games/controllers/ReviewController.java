package br.com.Games.Games.controllers;

import br.com.Games.Games.models.Review;
import br.com.Games.Games.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewService service;

     @GetMapping
    public List<Review> list() {
        return service.getAll();
    }

    @PostMapping
    public Review create(@RequestBody Review review) {
        return service.create(review);
    }
}
