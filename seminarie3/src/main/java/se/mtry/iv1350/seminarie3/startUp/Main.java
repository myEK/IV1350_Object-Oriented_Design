package se.mtry.iv1350.seminarie3.startUp;

import se.mtry.iv1350.seminarie3.controller.Controller;
import se.mtry.iv1350.seminarie3.view.View;

/**
 * Startar upp programet, använs för starta denna applikationen.
 * 
 * @author mtrys
 */
public class Main {
    /**
     * använs för starta denna applikationen.
     * 
     * @param args - Denna tar inga parameter
     */
    public static void main(String[] args) {
        Controller contr = new Controller();
        new View(contr).testProgramBygger();
    }
}
