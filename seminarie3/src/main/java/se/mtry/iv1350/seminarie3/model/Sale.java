package se.mtry.iv1350.seminarie3.model;

import se.mtry.iv1350.seminarie3.intergresen.VaraDTO;

/**
 * Skapad ny sale för varige påbörjat köp med en kund,
 * 
 * @author mtrys
 */
public class Sale {
    private Receipt rec;

    /**
     * Skapar en instans för köpet, samt sid för köpet.
     */
    public Sale() {
        this.rec = new Receipt();

    }

    public Receipt addvara(VaraDTO vara, double artikelAntal) {
        if (errorKol(vara)) {
            rec.addVara(vara, artikelAntal);
            return rec;
        } else {
            // Varan Hittades inte
        }
        return null;
    }

    /**
     * Kollar om det finns någon data under vara parameten
     * 
     * @param vara
     * @return Boolean Kollar om Samt/Falsk true eller false tillacka
     */
    private boolean errorKol(VaraDTO vara) {
        if (vara == null) {
            return false;
        }
        return true;
    }
}
