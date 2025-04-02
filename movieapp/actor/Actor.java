package com.xworkz.movieapp.actor;

public class Actor {

        public int actorId;
        public String[] actorNames;

        public void showDetails(){
            System.out.println("Actor ID is " + actorId);
            for(String actorDetail : actorNames){
                System.out.println(actorDetail);
            }
        }
    }


