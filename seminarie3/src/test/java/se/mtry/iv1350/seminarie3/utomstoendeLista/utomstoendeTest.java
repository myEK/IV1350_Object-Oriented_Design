package se.mtry.iv1350.seminarie3.utomstoendeLista;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import se.mtry.iv1350.seminarie3.intergresen.VaraDTO;

/**
 *
 * @author mtrys
 */
public class utomstoendeTest {
    
    
    @Test
    public void testNyVara() {
                
        utomstoende fy = new utomstoende();
        VaraDTO a1 = new VaraDTO();
        a1.nyVaraDTO("001","Lök",1,2);
        VaraDTO a2 = new VaraDTO();
        a2.nyVaraDTO("002","Röd-Lök",1,2);
        VaraDTO a3 = new VaraDTO();
        a3.nyVaraDTO("003","gurka",1,2);
        
        fy.nyVara(a1);
        fy.nyVara(a2);
        fy.nyVara(a3);    
        
        String expResult = "001, Lök, 1.0, 2, 0.0,\n" +
"002, Röd-Lök, 1.0, 2, 0.0,\n" +
"003, gurka, 1.0, 2, 0.0,\n";
        String result = fy.toString();

        assertEquals(expResult, result, "Skapade inte varorna korekt");
        
    }

    @Test
    public void testHittaVaraSaknas() {
        String artikelID = "002";
        utomstoende instance = new utomstoende();
        VaraDTO expResult = null;
        VaraDTO result = instance.hittaVara(artikelID);
        assertEquals(expResult, result, "Inte rätt värde genererades");
    }
       
    @Test
    public void testHittaVaraFinns() {
        String artikelID = "002";
        utomstoende fy = new utomstoende();
        
        VaraDTO a1 = new VaraDTO();
        a1.nyVaraDTO("001","Lök",1,2);
        fy.nyVara(a1);
        
        VaraDTO a2 = new VaraDTO();
        a2.nyVaraDTO("002","Röd-Lök",1,2);
        fy.nyVara(a2);
        
        VaraDTO a3 = new VaraDTO();
        a3.nyVaraDTO("003","gurka",1,2);
        fy.nyVara(a3);
        
        VaraDTO expResult = a2;
        VaraDTO result = fy.hittaVara(artikelID);
        assertEquals(expResult, result, "Inte rätt värde genererades");
    }

    @Test
    public void testToStringTommLista() {
        utomstoende instance = new utomstoende();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result, "Fick inte rätt");
    }
    
        @Test
    public void testToStringLista() {
        utomstoende fy = new utomstoende();
        VaraDTO a1 = new VaraDTO();
        a1.nyVaraDTO("001","Lök",1,2);
        fy.nyVara(a1);

        String expResult = "001, Lök, 1.0, 2, 0.0,\n";
        String result = fy.toString();
        
        assertEquals(expResult, result, "Fel värden genereades");
    }
}
