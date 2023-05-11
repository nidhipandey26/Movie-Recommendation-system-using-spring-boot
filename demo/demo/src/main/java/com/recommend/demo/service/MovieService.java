package com.recommend.demo.service;

import com.recommend.demo.model.Movie;
import com.recommend.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getMovies(){
       return movieRepository.findAll();
    }

    public void addMovies(Movie movie){
        movieRepository.save(movie);
    }
}
