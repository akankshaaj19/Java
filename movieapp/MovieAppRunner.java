package com.xworkz.movieapp;

import com.xworkz.movieapp.actor.Actor;
import com.xworkz.movieapp.movie.Movie;
import com.xworkz.movieapp.moviemanager.MovieManager;

public class MovieAppRunner {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.movieId = 1;
        movie.movieName = "The Dark Knight";

        MovieManager movieManager = new MovieManager();
        movieManager.managerId = 1;
        movieManager.managerName = "Rohan";

        String[] actorNamesList1 = {"Yash", "Sudeep", "Darshan"};
        String[] actorNamesList2 = {"Radhika", "Rachitha"};
        Actor[] actors = new Actor[2];

        Actor actor1 = new Actor();
        actor1.actorId = 1;
        actor1.actorNames = actorNamesList1;
        actors[0] = actor1;

        Actor actor2 = new Actor();
        actor2.actorId = 2;
        actor2.actorNames = actorNamesList2;
        actors[1] = actor2;

        movieManager.actors = actors;
        movie.manager = movieManager;

        movie.fetchDetails();
    }
}

