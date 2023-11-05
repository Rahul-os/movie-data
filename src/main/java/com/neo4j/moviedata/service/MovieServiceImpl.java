package com.neo4j.moviedata.service;

import com.neo4j.moviedata.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import com.neo4j.moviedata.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    MovieRepository repository;

    @Override
    public List<Movie> getAllMovies() {
        return repository.getAllMoviesInDB();
    }

    @Override
    public Movie createMovie(Movie movie) {
       return repository.save(movie);
    }

    @Override
    public void createGenreRelationship(String genre , String title) {
        repository.createGenreRelationship(genre,title);
    }

    @Override
    public void createActorRelationship(String actor, String title) {
        repository.crateActorRelationship(actor, title);
    }

    @Override
    public void createDirectorRelationship(String director, String title) {
        repository.createDirectorRelationship(director,title);
    }


}
