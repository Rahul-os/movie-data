package com.neo4j.moviedata.service;

import com.neo4j.moviedata.entity.Movie;

import java.util.List;

public interface MovieService {

    public List<Movie> getAllMovies();

    public Movie createMovie(Movie movie);


    void createGenreRelationship(String genre , String title);


    void createActorRelationship(String actor, String title);

    void createDirectorRelationship(String director, String title);

}
