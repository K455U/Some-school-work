package harjoitus1;

import java.util.Scanner;

public class Sarmio {

	public static void main(String[] args) {
		
		Scanner s= new Scanner (System.in);
		System.out.println("Sy�t� s�rmi�n leveys");
		double l=s.nextDouble();
		System.out.println("Sy�t� s�rmi�n pituus");
		double p=s.nextDouble();
		System.out.println("Sy�t� s�rmi�n korkeus");
		double k=s.nextDouble();
		
	double tilavuus= l*p*k;
		System.out.println("S�rmi�n tilavuus on:" +tilavuus);
		
	}

}
