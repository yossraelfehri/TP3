package TP3_3;

import TP3_2.Compte;

public class Maison {
	private String type;
	private String adr;
	private int nbchambre;
	private float s;
	public Maison (String adr, String t, int n) {
		this.adr = adr;
		type = t;
		nbchambre = n;
	}
	public Maison (String a, String t, int n, float s) {
		adr = a;
		type = t;
		nbchambre = n;
		this.s = s;
	}
	public void setSurface (float s) {
		this.s = s;
	}
	public float calculPrix (float pmc) {
		float prix = s*pmc;
		return prix;
	}
	public float calculPrix () {
		float prix = s*2100;
		return prix;
	}
	public String toChaine () {
		return( type+" de "+s+"m2 à"+adr+" avec "+nbchambre+" chambres");
	}
	
	public static void main (String [] args) {
		Maison m1 = new Maison("Tunis","un duplex",4,210);
		Maison m2 = new Maison("Nabeul","une villa",5);
		System.out.println(m1.toChaine());
		System.out.println(m2.toChaine());
	
		m2.setSurface(230);
		System.out.println("le prix de m1 est : "+m1.calculPrix(3000));
		System.out.println("le prix de m2 est : "+m2.calculPrix());
	}
}
