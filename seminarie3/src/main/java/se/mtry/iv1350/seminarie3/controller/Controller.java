package se.mtry.iv1350.seminarie3.controller;

import se.mtry.iv1350.seminarie3.intergresen.HittaVara;
import se.mtry.iv1350.seminarie3.intergresen.VaraDTO;
import se.mtry.iv1350.seminarie3.model.Receipt;
import se.mtry.iv1350.seminarie3.model.Sale;

/**
 * Programet kontroller, Alla anrop från view till model paserar här.
 * 
 * @author mtrys
 */
public class Controller {
    private Sale sale;
    private HittaVara hVara;

    /**
     * Skapar det nya köpet för varige kund. Denna måste anroppas före det andra.
     */
    public void startNySale() {
        sale = new Sale();
        hVara = new HittaVara();
    }

     /**
     * Lägger till en ny vara i systemet, kollar först och hämtar data från hitta vara och sedan vidare till sail. Om flera varor registreras
     * @param artikelID
     * @return Recipt, Får tillbacka information om köpet 
     */
    public Receipt addVara(String artikelID) {
        VaraDTO vara = hVara.kollaVara(artikelID);
        int artikelAntal = 1;
        return sale.addvara(vara, artikelAntal);
    }
    /**
     * Lägger till en ny vara i systemet, kollar först och hämtar data från hitta vara och sedan vidare till sail. Om flera varor registreras
     * @param artikelID
     * @param artikelAntal
     * @return Recipt, Får tillbacka information om köpet 
     */
    public Receipt addVara(String artikelID, double artikelAntal) {
        VaraDTO vara = hVara.kollaVara(artikelID);
        return sale.addvara(vara, artikelAntal);
    }
}