package harjoitus1;

import java.util.Scanner;

public class Sarmio {

	public static void main(String[] args) {
		
		Scanner s= new Scanner (System.in);
		System.out.println("Syötä särmiön leveys");
		double l=s.nextDouble();
		System.out.println("Syötä särmiön pituus");
		double p=s.nextDouble();
		System.out.println("Syötä särmiön korkeus");
		double k=s.nextDouble();
		
	//Koodi laskee särmiön tilavuuden, kun sille syöttää arvot	
		
	double tilavuus= l*p*k;
		System.out.println("Särmiön tilavuus on:" +tilavuus);
		
	}

}
