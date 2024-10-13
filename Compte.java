package TP3_2;

public class Compte {
	public int numero;
	public  float solde = 0;
	public static int count = 0;
	public  void deposer(float m) {
		solde += m;
	}
	public  void retirer(float m) {
		solde -= m;
	}
	public float getSolde() {
		return this.solde;
	}
	public void transfert(float m , Compte c) {
		this.solde = this.solde-m;
		c.solde = c.solde+m;
	}
	public Compte() {
		count ++;
		numero = count;
		solde = 0;
	}
}
