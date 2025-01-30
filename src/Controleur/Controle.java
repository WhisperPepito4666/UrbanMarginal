package Controleur;

import Vue.EntreeJeu;

public class Controle {

	private EntreeJeu frmEntreeJeu;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Controle();
	}
	private Controle() {
		this.frmEntreeJeu=new EntreeJeu();
		this.frmEntreeJeu.setVisible(true);
	}

}
