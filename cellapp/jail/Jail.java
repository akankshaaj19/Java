package com.xworkz.cellapp.jail;

import com.xworkz.cellapp.warden.Warden;
import com.xworkz.cellapp.cell.Cell;

public class Jail {
    public int jailId;
    public String jailName;
    public Warden warden;
    public Cell[] cells;

    public void fetchDetails() {
        System.out.println("Jail ID is " + jailId);
        System.out.println("Jail Name is " + jailName);
        System.out.println("Warden details are: ");
        warden.getDetails();
        System.out.println("Cell details are: ");
        for (Cell cell : cells) {
            cell.showDetails();
        }
    }
}
