package TP3_2;

import TP3_1.Entier;

public class Banque {
	public static void main (String [] args) {
		Compte co1 = new Compte();
		Compte co2 = new Compte();
		
		System.out.println("le numero de co1 est : "+co1.numero+" et le solde est : "+co1.solde);
		System.out.println("le numero de co2 est : "+co2.numero+" et le solde est : "+co2.solde);
		
		co1.deposer(1200);
		co2.deposer(500);
		System.out.println("le numero de co1 est : "+co1.numero+" et le solde est : "+co1.solde);
		System.out.println("le numero de co2 est : "+co2.numero+" et le solde est : "+co2.solde);
		
		co2.transfert(700, co1);
		if (co1.solde <= 0) {
			System.out.println("co1 est en rouge et son solde");
		}else if (co2.solde <= 0){
			System.out.println("co2 est en rouge et son solde");
		}
	}
}
