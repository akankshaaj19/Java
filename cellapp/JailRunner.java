package com.xworkz.cellapp;

import com.xworkz.cellapp.cell.Cell;
import com.xworkz.cellapp.guard.Guard;
import com.xworkz.cellapp.jail.Jail;
import com.xworkz.cellapp.warden.Warden;

class JailRunner{
public static void main(String[] args) {
        Jail jail = new Jail();
        jail.jailId = 101;
        jail.jailName = "High Security Facility";

        Warden warden = new Warden();
        warden.wardenId = 1;
        warden.wardenName = "ram";


        String[] guardNames1 = {"raj", "seeta"};
        String[] guardNames2 = {" Sarah", "Officer Lisa","teju"};
        Guard[] guards = new Guard[2];

        Guard guard1 = new Guard();
        guard1.guardId = 1;
        guard1.guardNames = guardNames1;
        guards[0] = guard1;

        Guard guard2 = new Guard();
        guard2.guardId = 2;
        guard2.guardNames = guardNames2;
        guards[1] = guard2;

        warden.guards = guards;


        String[] cell1Inmates = {"John", "Mark "};
        String[] cell2Inmates = {"James ", "tom","peter","andie"};
        Cell[] cells = new Cell[2];

        Cell cell1 = new Cell();
        cell1.cellId = 101;
        cell1.cellType = "Solitary";
        cell1.inmates = cell1Inmates;
        cells[0] = cell1;

        Cell cell2 = new Cell();
        cell2.cellId = 102;
        cell2.cellType = "General";
        cell2.inmates = cell2Inmates;
        cells[1] = cell2;

        jail.cells = cells;
        jail.warden = warden;


        jail.fetchDetails();
    }}

