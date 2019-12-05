package view;

import java.util.Observer;

import controller.BibliothequeController;
import model.Bibliotheque;

public abstract class BibliothequeVue implements Observer{
	
	protected Bibliotheque model;
	protected BibliothequeController controller;
	
	BibliothequeVue(Bibliotheque model,
			BibliothequeController controller) {
		this.model = model;
		this.controller = controller;
		// TODO : Connexion entre la vue et le modele
	}

	public abstract void affiche(String string) ;
}