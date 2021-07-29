package se.mtry.iv1350.seminarie3.view;

import se.mtry.iv1350.seminarie3.controller.Controller;
import se.mtry.iv1350.seminarie3.model.Receipt;

import java.text.DecimalFormat;

/**
 * Sidan mot användaren intugrerar med systemet Sickar alla anrop till
 * controller för prata med systemet
 * 
 * @author mtrys
 */
public class View {
    private Controller contr;

    /**
     * sparar controller under view.
     * 
     * @param contr Är tillför att använda för anrop till andra lager i programet.
     */
    public View(Controller contr) {
        this.contr = contr;
    }

    /**
     * Tillför testa olika komandos och funktioner i programet under bygget. Denna
     * Skapar en påhittat köp.
     */
    public void testProgramBygger() {
        contr.startNySale();
        System.out.println("Nytt köp har startat");
        
        testnyaVaror();
        System.out.println("Nytt vara inlagd");
    }

    /**
     * lägger till nya varor i köpet
     */
    private void testnyaVaror() {

        ShoResultatKvitto(contr.addVara("004", 1));
        ShoResultatKvitto(contr.addVara("002", 2));
        ShoResultatKvitto(contr.addVara("002", 3));
        ShoResultatKvitto(contr.addVara("005", 3));
    }

    /**
     * Visar det registrerade varona
     * 
     * @param ret kvitto lagringen.
     */
    private void ShoResultatKvitto(Receipt ret) {
        String formatter = "##,###.##";
        DecimalFormat df = new DecimalFormat(formatter);
        
        System.out.println("Inregistrerade varor:");
        System.out.println("--------------------------------");
        System.out.println(ret.getSailDTO());
        System.out.println("--------------------------------");
        System.out.println(
                "pris: " + ret.getKostnadDTO().getPris() + "kr   (av: " + df.format(ret.getKostnadDTO().getMoms()) + "kr i moms)");
        System.out.println("--------------------------------");
        System.out.println(ret.getSailStartTid().toString());
        System.out.println("--------------------------------\n\n\n");
    }
}
