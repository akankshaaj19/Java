package com.xworkz.cellapp.warden;

import com.xworkz.cellapp.guard.Guard;

public class Warden {
        public int wardenId;
        public String wardenName;
        public Guard[] guards;

        public void getDetails() {
            System.out.println("Warden ID is " + wardenId);
            System.out.println("Warden Name is " + wardenName);
            System.out.println("Guard details are: ");
            for (Guard guard : guards) {
                guard.showDetails();
            }
        }
    }


