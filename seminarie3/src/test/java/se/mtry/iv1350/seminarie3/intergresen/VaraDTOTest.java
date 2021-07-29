package se.mtry.iv1350.seminarie3.intergresen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VaraDTOTest {
    private String artikelID;
    private String artikelNamn;
    private double artikelPris;
    private int artikelMomsProsent;
    private VaraDTO instance;
    
    @BeforeEach
    public void setUp() {
        dataTillTestVara();
    }
    
    @AfterEach
    public void tearDown() {
        this.artikelID = null;
        this.artikelNamn = null;
        this.artikelPris = 0;
        this.artikelMomsProsent = 0;
        this.instance = null;
    }
    
    @Test
    public void testToString() {
        String expResult = "001, Tomat, 20.0, 12, 0.0";
        String result = instance.toString();
        assertEquals(expResult, result, "Den får inte rätt värden");
    }

    @Test
    public void testNyVaraDTO() {
        instance.nyVaraDTO(artikelID, artikelNamn, (artikelPris + 5.3), artikelMomsProsent);
        
        String expResult = "001, Tomat, 25.3, 12, 0.0";
        String result = instance.toString();

        assertEquals(expResult, result, "Skapa vara inte på rätt sätt");
        
    }
    
    @Test
    public void testNyVaraDTOVaraDTO() {
        VaraDTO nyInstance = new VaraDTO();
        nyInstance.nyVaraDTO("003", "Tomat", 12.5, 12);
        
        instance.nyVaraDTO(nyInstance);
        
        String expResult = "003, Tomat, 12.5, 12, 0.0";
        String result = instance.toString();

        assertEquals(expResult, result, "Skapa vara inte på rätt sätt");
        
    }

    @Test
    public void testGetVaraIDFinnsEJ() {
        this.instance = new VaraDTO();
        String result = this.instance.getVaraID();
                
        assertNull(result, "Fått felaktiga värden");        
    }
    
    @Test
    public void testGetVaraIDFinns() {
        this.instance.nyVaraDTO(this.artikelID, this.artikelNamn, this.artikelPris, this.artikelMomsProsent);
        
        String expResult = "001";
        String result = this.instance.getVaraID();
        
        assertEquals(expResult, result, "Fått felaktiga värden");
    }    
 
    
    
    /**
     * sätter standard värrderna i tsetet.
     */
    private void dataTillTestVara(){
        this.artikelID = "001";
        this.artikelNamn = "Tomat";
        this.artikelPris = 20.0;
        this.artikelMomsProsent = 12;
        this.instance = new VaraDTO();
        instance.nyVaraDTO(artikelID, artikelNamn, artikelPris, artikelMomsProsent);
    }
    
}
