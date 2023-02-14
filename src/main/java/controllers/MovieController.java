package controllers;

import models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/movie")
public class MovieController {

    @Autowired
    private MovieController movieController;

    @PostMapping
    public ResponseEntity newMovie(){
        Movie movie = movieController.newMovie();
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity getMovieStatus(){

    }

}
