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
		if (model.emprunte(numLivre)) {
			System.out.println("Le livre a bien �t� emprunt�.");
		}
		else {
			System.out.println("Le livre est d�j� emprunt�.");
		}
	}

	public void rendreLivre(int numLivre) {
		if (model.getLivres()[numLivre].estEmprunte()) {
			model.rendre(numLivre);
			System.out.println("Le livre a �t� rendu.");
		}
		else {
			System.out.println("Le livre a d�j� �t� rendu.");
		}
	}


	public void addView(BibliothequeVue vue) {
		this.vue = vue;
		
	}

}