package se.mtry.iv1350.seminarie3.intergresen;

/**
 * Sammlar alla kostnader för köpet
 * 
 * @author mtrys
 */
public class KostnadDTO {
    private double TottalPrisMedMoms;
    private double TottalMoms;

    /**
     * Lägger till priset in i köpet. Både pris med moms och momsen separat
     * 
     * @param vara
     * @param artikelAntal
     */
    public void nykostnad(VaraDTO vara, double artikelAntal) {
        double pris = vara.getArtikelPris() * artikelAntal;
        
        double nr = vara.getArtikelMomsProsent();
        double moms = nr/100;
        moms = moms * pris;


        TottalPrisMedMoms = TottalPrisMedMoms + pris;
        TottalMoms = TottalMoms + moms;
    }

    /**
     * Hämter den tottala kostnadern för köpen hitlis.
     * 
     * @return TottalPrisMedMoms
     */
    public double getPris() {
        return this.TottalPrisMedMoms;
    }

    /**
     * Hämter den tottala momsen för köpen hitlis.
     * 
     * @return TottalMoms
     */
    public double getMoms() {
        return this.TottalMoms;
    }

}
