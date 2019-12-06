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
			System.out.println("Le livre a bien été emprunté.");
		}
		else {
			System.out.println("Le livre est déjà emprunté.");
		}
	}

	public void rendreLivre(int numLivre) {
		if (model.getLivres()[numLivre].estEmprunte()) {
			model.rendre(numLivre);
			System.out.println("Le livre a été rendu.");
		}
		else {
			System.out.println("Le livre a déjà été rendu.");
		}
	}


	public void addView(BibliothequeVue vue) {
		this.vue = vue;
		
	}

}