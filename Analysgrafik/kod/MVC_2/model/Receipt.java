package MVC_2.model;

import dm.Rabatt_gilltighet;
import dm.Rabatt;
import MVC_2.Intergresen.SailDTO;
import MVC_2.Intergresen.KostnadDTO;
import MVC_2.Intergresen.VaraDTO;

public class Receipt {

	private int Startdatum;

	private int slutdatum;

	private Rabatt_gilltighet rabatt_gilltighet;

	private Rabatt rabatt;

	private Sale sale;

	private SailDTO sailDTO;

	private KostnadDTO kostnadDTO;

	private SailDTO sailDTO;

	private KostnadDTO kostnadDTO;

	private SailDTO sailDTO;

	private KostnadDTO kostnadDTO;

	public Receipt Receipt() {
		return null;
	}

	public Receipt addVara(VaraDTO varaInfo, int artikelAntal) {
		return null;
	}

	public void varar(VaraDTO varaInfo, int artikelAntal) {

	}

	public void kostnad(VaraDTO varaInfo, int artikelAntal) {

	}

	public Receipt error(VaraDTO varaInfo) {
		return null;
	}

	public Receipt addRabbat(VaraDTO rabbatInfo) {
		return null;
	}

	public double infoPrisReceipt() {
		return 0;
	}

	public Receipt infoReceipt() {
		return null;
	}

}
