package com.xworkz.gym;

import com.xworkz.gym.trainer.Trainer;

public class Manager {


    public int managerId;
    public String managerName;
    public Trainer[] trainers;

    public void getDetails() {
        System.out.println("Gym Manager ID is " + managerId);
        System.out.println("Gym Manager Name is " + managerName);
        System.out.println("Trainer details are: ");
        for (Trainer trainer : trainers) {
            trainer.showDetails();
        }
    }
}