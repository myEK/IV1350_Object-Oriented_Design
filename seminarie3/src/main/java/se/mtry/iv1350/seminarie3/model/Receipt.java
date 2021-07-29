package se.mtry.iv1350.seminarie3.model;

import java.time.LocalTime;
import se.mtry.iv1350.seminarie3.intergresen.KostnadDTO;
import se.mtry.iv1350.seminarie3.intergresen.SailDTO;
import se.mtry.iv1350.seminarie3.intergresen.VaraDTO;

/**
 * Sparar allt som rör köpet, kunden köp sparas här.
 * 
 * @author mtrys
 */
public class Receipt {
    private SailDTO sDto;
    private KostnadDTO kDto;
    private LocalTime setTimeOfSale;

    /**
     * Hämtar struktur för kunna spara information om köpet
     */
    public Receipt() {
        this.sDto = new SailDTO();
        this.kDto = new KostnadDTO();
        setTimeOfSale = LocalTime.now();
    }

    /**
     * Sparar varorna enligt den efterfrågade strukturen.
     * 
     * @param vara
     * @param artikelAntal
     */
    public void addVara(VaraDTO vara, double artikelAntal) {
        kDto.nykostnad(vara, artikelAntal);
        sDto.nyVara(vara, artikelAntal);

    }

    public SailDTO getSailDTO() {
        return sDto;
    }

    public KostnadDTO getKostnadDTO() {
        return kDto;
    }
    
    public LocalTime getSailStartTid(){
        return setTimeOfSale;
    }
}
