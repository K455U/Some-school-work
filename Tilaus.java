package harjoitus1;

import java.util.Scanner;

public class Tilaus {
	
	private String tuote;
	private double hinta;
	private int tilausmaara;
	
	public String getTuote() {
		return tuote;
	}
	public void setTuote(String tuote) {
		this.tuote = tuote;
	}
	public double getHinta() {
		return hinta;
	}
	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
	public int getTilausmaara() {
		return tilausmaara;
	}
	public void setTilausmaara(int tilausmaara) {
		this.tilausmaara = tilausmaara;
	}
	
	public static void main(String[] args) {
		Tilaus reppu = new Tilaus();
		reppu.setHinta(17.5);
		reppu.setTilausmaara(10);
		reppu.setTuote("Reppu");
		
		System.out.println(reppu.getTuote()+ reppu.getHinta()*reppu.getTilausmaara());
	}
		
	
}
