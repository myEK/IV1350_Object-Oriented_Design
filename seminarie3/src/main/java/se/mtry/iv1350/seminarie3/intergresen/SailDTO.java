package se.mtry.iv1350.seminarie3.intergresen;

/**
 *
 * @author mtrys
 */
public class SailDTO {
    private VaraDTO[] regVaror;

    public SailDTO() {
        this.regVaror = new VaraDTO[0];
    }

    public void nyVara(VaraDTO vara, double antal) {
        vara = nyVaraAntal(vara, antal);

        int finns = sokVara(vara.getVaraID());

        if (finns == 0) {
            aderaVara(vara);
        } else {
            nyVaraAntal(regVaror[finns - 1], antal);
        }
    }

    /**
     * Aderar antalet varor av varige sort
     * 
     * @param vara  varan som önskar öka med
     * @param antal hur mycket ska öka med
     * @return vara med det nya antal aderat
     */
    private VaraDTO nyVaraAntal(VaraDTO vara, double antal) {
        double st = antal + vara.getArtikelAntal();
        vara.setArtikelAntal(st);
        return vara;
    }

    /**
     * Söker om varan redan finns med i listan Om svar blir 0 så finns inte men om 1
     * är först på listan.
     * 
     * @param artikelID varans artikelID kod
     * @return int på vilken platts den finns på annasr 0,
     */
    private int sokVara(String artikelID) {
        for (int i = 0; i < this.regVaror.length; i++) {
            if (this.regVaror[i].getVaraID().equals(artikelID)) {
                return i + 1;
            }
        }
        return 0;
    }

    /**
     * Lägger till den nya varan i det registrerade varorna som finns.
     * 
     * @param vara aderar varan i listan.
     */
    private void aderaVara(VaraDTO vara) {
        VaraDTO[] nyVaror = new VaraDTO[this.regVaror.length + 1];
        int i = 0;
        for (i = 0; i < this.regVaror.length; i++) {
            nyVaror[i] = this.regVaror[i];
        }
        nyVaror[i] = vara;
        this.regVaror = nyVaror;
    }
    
    /**
     * Skriver ut listan 
     * @return String format av lista.
     */
    public String toString() {

    String s = "";
    for (int i = 0; i < this.regVaror.length; i++) {
        s = s + this.regVaror[i].toString() + ",\n";
    }
    return s;
    }
}
