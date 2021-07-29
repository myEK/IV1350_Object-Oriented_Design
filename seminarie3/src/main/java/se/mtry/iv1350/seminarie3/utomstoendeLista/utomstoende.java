package se.mtry.iv1350.seminarie3.utomstoendeLista;

import se.mtry.iv1350.seminarie3.intergresen.VaraDTO;

/**
 * Exstarnt laagersystem som har varorna inregistrerade
 * 
 * @author mtrys
 */
public class utomstoende {
    private VaraDTO[] varor;

    /**
     * För att kopigera en lista.
     * 
     * @return vara genererar listan
     */
    public utomstoende() {
        this.varor = new VaraDTO[0];
    }

    /**
     * Lägger till en ny vara i listan
     * 
     * @param vara en vara enligt VaraDTO strukturen
     */
    public void nyVara(VaraDTO vara) {
        VaraDTO[] nyVaror = new VaraDTO[this.varor.length + 1];
        int i = 0;
        for (i = 0; i < this.varor.length; i++) {
            nyVaror[i] = this.varor[i];
        }
        nyVaror[i] = vara;
        this.varor = nyVaror;
    }

    public void delitNullLista() {
        this.varor = null;
    }

    /**
     * Söker efter artikelID mot det inlaggda varorna, sender tillbacka
     * informationen om varorna. annasr sickar den tillbacka null.
     * 
     * @param artikelID varans artikelID kod
     * @return VaraDTO Returera antigen varaDTO format eller Null om inte hittar
     *         någon vara
     */
    public VaraDTO hittaVara(String artikelID) {
        for (int i = 0; i < this.varor.length; i++) {
            if (this.varor[i].getVaraID() == artikelID) {
                return this.varor[i];
            }
        }
        return null;
    }

    public String toString() {

        String s = "";
        for (int i = 0; i < this.varor.length; i++) {
            s = s + this.varor[i].toString() + ",\n";
        }
        return s;

    }
}
