package se.mtry.iv1350.seminarie3.intergresen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SailDTOTest {
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testNyVara() {
        VaraDTO vara = new VaraDTO();
        vara.nyVaraDTO("002", "artikelNamn", 0, 0);
        double antal = 1;
        
        SailDTO instance = new SailDTO();
        instance.nyVara(vara, antal);
                
        String expResult = "002, artikelNamn, 0.0, 0, 1.0,\n";
        String result = instance.toString();
        assertEquals(expResult, result, "Inte rätt värde genererades");
        
    }
    
}
