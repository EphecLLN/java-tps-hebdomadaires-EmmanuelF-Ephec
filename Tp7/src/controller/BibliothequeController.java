/**
 * 
 */
package controller;

/**
 * @author emman
 *
 */
import model.Bibliotheque;
import view.BibliothequeVue;

public class BibliothequeController {
	Bibliotheque model; 
	BibliothequeVue vue;
	public BibliothequeController(Bibliotheque model) {
		this.model = model;
	}


	public void emprunteLivre(int numLivre) {
	
		//TODO 
	}

	public void rendreLivre(int numLivre) {
		//TODO
	}


	public void addView(BibliothequeVue vue) {
		this.vue = vue;
		
	}

}