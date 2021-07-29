package MVC_2.model;

import MVC_2.controller.Controller;
import MVC_2.Intergresen.VaraDTO;

public class Sale {

	private Controller controller;

	private Receipt receipt;

	private KvittoPrinter kvittoPrinter;

	public void startNySale() {

	}

	public void setTimeOfSale() {

	}

	public Receipt addVara(VaraDTO varaInfo, int artikelAntal) {
		return null;
	}

	private boolean errorKoll(VaraDTO varaInfo) {
		return false;
	}

	public Receipt addRabbat(VaraDTO rabbatInfo) {
		return null;
	}

	public double kollaVexsel(double kundBetalat) {
		return 0;
	}

	public Receipt infoSale() {
		return null;
	}

}
