package se.mtry.iv1350.seminarie3.intergresen;

import java.lang.*;

/**
 * Strukturen hur varan sparas
 * 
 * @author mtrys
 */
public class VaraDTO {
    private String artikelID;
    private String artikelNamn;
    private double artikelPris;
    private int artikelMomsProsent;
    private double artikelAntal;

    /**
     * Skapar ny vara. med parametrarna
     * 
     * @param artikelID          Varans kod sträng
     * @param artikelNamn        Varans beskrivning
     * @param artikelPris        Varans pris
     * @param artikelMomsProsent Varans momsatts på produkten.
     */
    public void nyVaraDTO(String artikelID, String artikelNamn, double artikelPris, int artikelMomsProsent) {
        this.artikelID = artikelID;
        this.artikelNamn = artikelNamn;
        this.artikelPris = artikelPris;
        this.artikelMomsProsent = artikelMomsProsent;
        this.artikelAntal = 0;
    }

    public void nyVaraDTO(VaraDTO v) {
        this.artikelID = v.artikelID;
        this.artikelNamn = v.artikelNamn;
        this.artikelPris = v.artikelPris;
        this.artikelMomsProsent = v.artikelMomsProsent;
        this.artikelAntal = v.artikelAntal;
    }

    /**
     * Få framm artikens vara ID för kunna söka vara,
     * 
     * @return artikelID
     */
    public String getVaraID() {
        return this.artikelID;
    }

    /**
     * För att få in artikelPris för en vara
     * 
     * @return artikelPris Får priset för en artikel.
     */
    public double getArtikelPris() {
        return this.artikelPris;
    }

    /**
     * Get momsattsen för varan
     * 
     * @return artikelMomsProsent (int)
     */
    public int getArtikelMomsProsent() {
        return this.artikelMomsProsent;
    }

    /**
     * Get antal stycken varor eller exempelvis kg tomater.
     * 
     * @return artikelAntal (double)
     */
    public double getArtikelAntal() {
        return this.artikelAntal;
    }

    /**
     * Ändrar antalet registrerade varor till artikelAntal,
     * 
     * @param artikelAntal hur många varor som letas
     */
    public void setArtikelAntal(double artikelAntal) {
        this.artikelAntal = artikelAntal;
    }

    /**
     * Skriver ut varan i stringformat.
     * 
     * @return Vara i String format
     */
    public String toString() {
        String s = "";
        s = this.artikelID + ", " + this.artikelNamn + ", " + this.artikelPris + ", " + this.artikelMomsProsent + ", "
                + this.artikelAntal;
        return s;
    }

}
