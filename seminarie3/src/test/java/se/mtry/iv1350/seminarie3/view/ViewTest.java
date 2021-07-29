package se.mtry.iv1350.seminarie3.view;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import se.mtry.iv1350.seminarie3.controller.Controller;

public class ViewTest {
    private View instanViewTest;
    private ByteArrayOutputStream printout;
    private PrintStream originalSysOut;

    @BeforeEach
    public void setUp() {
        Controller contr = new Controller();
        instanViewTest = new View(contr);

        printout = new ByteArrayOutputStream();
        PrintStream inMemsysOut = new PrintStream(printout);
        originalSysOut = System.out;
        System.setOut(inMemsysOut);

    }

    @AfterEach
    public void tearDown() {
        instanViewTest = null;

        printout = null;
        System.setOut(originalSysOut);
    }

    @Test
    public void testTestProgramBygger() {
        instanViewTest.testProgramBygger();
        String printoutskriv = printout.toString();
        String expectedOutput = "startat";
        assertTrue(printoutskriv.contains(expectedOutput), "Ui startade inte korekt.");
    }

}
