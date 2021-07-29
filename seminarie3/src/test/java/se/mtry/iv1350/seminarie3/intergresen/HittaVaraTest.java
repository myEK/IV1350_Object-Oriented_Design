package se.mtry.iv1350.seminarie3.intergresen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HittaVaraTest {
    private HittaVara instance;
    
    @BeforeEach
    public void setUp() {
        instance = new HittaVara();
        instance.fakeTestByggVaraLista();
    }
    
    @AfterEach
    public void tearDown() {
        instance = null;
    }

    @Test
    public void testKollaVaraEjHiittar() {
        String artikelID = "";
        VaraDTO expResult = null;
        VaraDTO result = instance.kollaVara(artikelID);
        assertEquals(expResult, result, "Genererar fel värden tillbacka");
    }
    
    @Test
    public void testKollaVaraFinns() {
        String artikelID = "002";
        VaraDTO expResult = new VaraDTO();
        expResult.nyVaraDTO("002", "Paprika", 25, 12);
        VaraDTO result = instance.kollaVara(artikelID);
        
        assertEquals(expResult.toString(), result.toString(), "Genererar fel värden tillbacka");
    }

    @Test
    public void testFakeTestByggVaraLista() {
        instance.fakeTestByggVaraLista();
    }
}
