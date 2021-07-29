package se.mtry.iv1350.seminarie3.startUp;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class MainTest {
    private Main instanMainTest;
    private ByteArrayOutputStream printout;
    private PrintStream originalSysOut;

    @BeforeEach
    public void setUp() {
        instanMainTest = new Main();

        printout = new ByteArrayOutputStream();
        PrintStream inMemsysOut = new PrintStream(printout);
        originalSysOut = System.out;
        System.setOut(inMemsysOut);

    }

    @AfterEach
    public void tearDown() {
        instanMainTest = null;

        printout = null;
        System.setOut(originalSysOut);
    }

    
    @Test
    public void testUIstartarMain() {
        String[] args = null;
        Main.main(args);
        String printoutskriv = printout.toString();
        String expectedOutput = "startat";
        assertTrue(printoutskriv.contains(expectedOutput), "Ui startade inte korekt.");
    }
    
    
}
