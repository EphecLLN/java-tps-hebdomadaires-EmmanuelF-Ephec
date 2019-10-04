/**
 * Création de classe : Classe Calculatrice ( Tp1-4.1)
 * Date de création : 22/09
 */

package tp1;

/**
 * Classe permettant de créer une calculatrice basique
 * @author Foureau Emmanuel
 */

public class Calculatrice {
	// Attributs - Variables d'instances
	
	double valeurCourante;
	
	
	/**
	 *  Méthode ajoutant le nombre n à la valeurCourante
	 * @param n est le nombre à ajouter -
	 */
	
	void ajoute(double n) {
		valeurCourante = valeurCourante + n;
	}
	
	/**
	 * Méthode soustrayant le nombre n à la valeur courante
	 * @param n est le nombre à soustraire
	 */
	
	void soustrait(double n) {
		valeurCourante = valeurCourante - n;
	}
	
	/**
	 * Méthode qui met au carré la valeurCourante
	 */
	
	void carre() {
		valeurCourante = Math.pow(valeurCourante, 2);
	}
	
	/**
	 * Lignes d'éxécution de la classe
	 * @param args : Paramètre de la ligne de commande
	 */
	public static void main(String[] args) {
		Calculatrice calc = new Calculatrice();
		calc.ajoute(5);
		calc.soustrait(2);
		calc.carre();
		System.out.println(calc.valeurCourante);
	}

}
