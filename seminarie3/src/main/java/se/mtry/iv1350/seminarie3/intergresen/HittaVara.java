package se.mtry.iv1350.seminarie3.intergresen;

import se.mtry.iv1350.seminarie3.utomstoendeLista.utomstoende;

/**
 *
 * @author mtrys
 */
public class HittaVara {
    private utomstoende uLista;

    /**
     * Sätter upp listan för Varorna i afärens utbud.
     */
    public HittaVara(){
        uLista = new utomstoende();
    }
    
    /**
     * För söka efter varan i lager systemet. 
     * @param artikelID Artikens ID i string format. 
     * @return VaraID Sickar tillbaka varan info, Om ingen vara hittas får värdet null tillbacka. 
     */
    public VaraDTO kollaVara(String artikelID){
        // för skapa test lista.
        this.uLista = new utomstoende();
        fakeTestByggVaraLista();
        
        return this.uLista.hittaVara(artikelID);
    }
    
    
    /**
     * Skapas för kunna testa systemet mot varor innan några är inlagda.
     */
    public void fakeTestByggVaraLista() {
               
        VaraDTO v1 = new VaraDTO();
        v1.nyVaraDTO("001", "Tomat", 20, 12);
        this.uLista.nyVara(v1);

        VaraDTO v2 = new VaraDTO();
        v2.nyVaraDTO("002", "Paprika", 25, 12);
        this.uLista.nyVara(v2);

        VaraDTO v3 = new VaraDTO();
        v3.nyVaraDTO("003", "Vit lök", 30, 12);
        this.uLista.nyVara(v3);

        VaraDTO v4 = new VaraDTO();
        v4.nyVaraDTO("004", "Gul lök", 35, 12);
        this.uLista.nyVara(v4);

        VaraDTO v5 = new VaraDTO();
        v5.nyVaraDTO("005", "Röd lök", 40, 12);
        this.uLista.nyVara(v5);

        VaraDTO v6 = new VaraDTO();
        v6.nyVaraDTO("006", "Gurka", 45, 12);
        this.uLista.nyVara(v6);
    }
}
