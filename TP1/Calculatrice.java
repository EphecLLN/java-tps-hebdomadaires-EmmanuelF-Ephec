/**
 * Cr�ation de classe : Classe Calculatrice ( Tp1-4.1)
 * Date de cr�ation : 22/09
 */

package tp1;

/**
 * Classe permettant de cr�er une calculatrice basique
 * @author Foureau Emmanuel
 */

public class Calculatrice {
	// Attributs - Variables d'instances
	
	double valeurCourante;
	
	
	/**
	 *  M�thode ajoutant le nombre n � la valeurCourante
	 * @param n est le nombre � ajouter -
	 */
	
	void ajoute(double n) {
		valeurCourante = valeurCourante + n;
	}
	
	/**
	 * M�thode soustrayant le nombre n � la valeur courante
	 * @param n est le nombre � soustraire
	 */
	
	void soustrait(double n) {
		valeurCourante = valeurCourante - n;
	}
	
	/**
	 * M�thode qui met au carr� la valeurCourante
	 */
	
	void carre() {
		valeurCourante = Math.pow(valeurCourante, 2);
	}
	
	/**
	 * Lignes d'�x�cution de la classe
	 * @param args : Param�tre de la ligne de commande
	 */
	public static void main(String[] args) {
		Calculatrice calc = new Calculatrice();
		calc.ajoute(5);
		calc.soustrait(2);
		calc.carre();
		System.out.println(calc.valeurCourante);
	}

}
