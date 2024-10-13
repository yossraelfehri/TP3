package TP3_1;

public class Entier {
	private int n;
	private int e1;
	private int e2;
	static int valeur  = 0; 
	public Entier (int valeur) {
		this.valeur = valeur;
	}
	
	public static int factoriel(int n) {
		int f=1;
		for (int i=1 ; i<=n ; i++) {
			f = f*i;
		}
		return f;
	}
	public static void absolu(int n) {
		if (n < 0) {
			System.out.println("la valeur absolu de n est : "+(n*-1));
		}else {
			System.out.println("la valeur absolu de n est : "+n);
		}
	}
	public static void comparer(int e1, int e2) {
		if (e1 > e2) {
			System.out.println("e1 est supérieur à e2");
		}else if (e1 == e2) {
			System.out.println("e1 et e2 sont égaux");
		}else {
			System.out.println("e2 est supérieur à e1");
		}
	}
	public static void premier(int n) {
		int i;
		int p=0;
		for (i=1 ; i<=n ; i++) {
			if (n%i == 0) {
				p += 1;
			}
		}
		if (p == 2) {
			System.out.println(n+" est premier");
		}else {
			System.out.println(n+" n'est pas premier");
		}
	}
	
}
