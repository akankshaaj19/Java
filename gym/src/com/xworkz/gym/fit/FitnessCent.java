package com.xworkz.gym.fit;

import com.xworkz.gym.Manager;

public class FitnessCent {
    public int centerId;
    public String centerName;
    public com.xworkz.gym.Manager Manager;

    public void fetchDetails(){
        System.out.println("Fitness Center ID is " + centerId);
        System.out.println("Fitness Center Name is " + centerName);
        System.out.println("Manager details are: "+Manager);
        Manager.getDetails();
    }

}
