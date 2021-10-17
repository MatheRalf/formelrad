package application;

/**
 * Berechnet das Formelrad
 * 
 * @author Peter Rutschmann
 * @version 13.09.2018
 */
public class Calculator {
	private double leistung;
	private double spannung;
	private double strom;
	private double widerstand;

	public Calculator(double leistung, double spannung, double strom, double widerstand) {
		super();
		this.leistung = leistung;
		this.spannung = spannung;
		this.strom = strom;
		this.widerstand = widerstand;
	}

	public double getLeistung() {
		return leistung;
	}

	public double getSpannung() {
		return spannung;
	}

	public double getStrom() {
		return strom;
	}

	public double getWiderstand() {
		return widerstand;
	}

	@Override
	public String toString() {
		return "Calculator [leistung=" + leistung + ", spannung=" + spannung + ", strom=" + strom + ", widerstand="
				+ widerstand + "]";
	}

	public void calculate() {
		/*
		 * Hier auf Grund der vorhanden Werte entscheiden welche Methode unten
		 * aufgerufen werden muss.
		 */

	}

	/*
	 * Hier die Methoden mit den Formlen hinzuf�gen
	 */

	public void getLeistungFromSpannungUndWiderstand(double spannung, double widerstand) {
		leistung = Math.pow(spannung, 2) / widerstand;
	}

	public void getLeistungFromSpannungUndStrom(double spannung, double strom) {
		leistung = spannung * strom;
	}

	public void getLeistungWiderstandUndStrom(double widerstand, double strom) {
		leistung = Math.pow(strom, 2) * widerstand;
	}

	public void getSpannungFromLeistungUndWiderstand(double leistung, double widerstand) {
		spannung = Math.sqrt((leistung * widerstand));
	}

	public void getSpannungFromLeistungUndStrom(double leistung, double strom) {
		spannung = leistung / strom;
	}

	public void getSpannungFromWiderstandUndStrom(double widerstand, double strom) {
		spannung = widerstand * strom;
	}

	public void getStromFromLeistungUndWiderstand(double leistung, double widerstand) {
    strom = Math.sqrt((leistung/widerstand));
  }

  public void getStromFromLeistungUndSpannung(double leistung, double spannung) {
    strom = leistung/spannung;
  }

   public void getStromFromSpannungUndWiderstand(double spannung, double widerstand) {
    strom = spannung/widerstand;
  }
}
