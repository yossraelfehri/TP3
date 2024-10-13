package TP3_1;

public class Calcul {
	public static void main (String [] args) {
		Entier e1 = new Entier(3);
		Entier e2 = new Entier(9);
		
		System.out.println("le factoriel de n est : "+Entier.factoriel(7));
		Entier.absolu(-5);
		Entier.comparer(9,-1);
		Entier.premier(7);
		
		System.out.println("le factoriel de n est : "+e1.factoriel(7));
		e1.absolu(-5);
		e1.comparer(9,-1);
		e1.premier(7);
		
		Entier valeur = new Entier(7) ;
		
	}
}
