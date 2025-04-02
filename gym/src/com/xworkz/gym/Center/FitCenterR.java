package com.xworkz.gym.Center;

import com.xworkz.gym.Manager;
import com.xworkz.gym.fit.FitnessCent;
import com.xworkz.gym.trainer.Trainer;

public class FitCenterR {
    public static void main(String[] args) {
        FitnessCent FitnessCent = new FitnessCent();
        FitnessCent.centerId = 1;
        FitnessCent.centerName = "Cult Fitness";

        Manager Manager = new Manager();
        Manager.managerId = 1;
        Manager.managerName = "Harsha";

        String[] trainerNamesList1 = {"Varun", "Sunad", "Hari"};
        String[] trainerNamesList2 = {"Jeevitha", "John"};
        Trainer[] trainers = new Trainer[2];

        Trainer trainer1 = new Trainer();
        trainer1.trainerId = 1;
        trainer1.trainerNames = trainerNamesList1;
        trainers[0] = trainer1;

        Trainer trainer2 = new Trainer();
        trainer2.trainerId = 2;
        trainer2.trainerNames = trainerNamesList2;
        trainers[1] = trainer2;

        Manager.trainers = trainers;
        FitnessCent.Manager = Manager;

        FitnessCent.fetchDetails();
    }

}
