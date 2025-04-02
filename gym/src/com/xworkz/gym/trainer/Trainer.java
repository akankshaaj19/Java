package com.xworkz.gym.trainer;

public class Trainer {
    public String[] trainerNames;
    public int trainerId;

    public void showDetails() {
        System.out.println("Trainer id is " + trainerId);
        for (String trainerDetail : trainerNames) {
            System.out.println(trainerDetail);}

    }

}
