/**
 * Création de classe : Classe Calculatrice ( Tp1-4.1)
 * Date de création : 22/09
 */

package tp2;

/**
 * Classe permettant de créer une calculatrice basique
 * @author Foureau Emmanuel
 */

public class Calculatrice {
	// Attributs - Variables d'instances
	
	private double valeurCourante;
	
	
	
	/**
	 * @return the valeurCourante
	 */
	public double getValeurCourante() {
		return valeurCourante;
	}

	/**
	 * @param valeurCourante the valeurCourante to set
	 */
	public void setValeurCourante(double valeurCourante) {
		this.valeurCourante = valeurCourante;
	}
	
	/**
	 * Constructeur initialisant la calculatrice à 0
	 */

	public Calculatrice() {
		this.valeurCourante = 0;
	}
	
	/**
	 * Constructeur initialisant la calculatrice 
	 * avec la valeur indiquée.
	 * @param value : valeur initiale pour la calculatrice
	 */
	
	public Calculatrice(double n) {
		this.valeurCourante = n;
	}
	
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
	 * Méthode d'affichage à l'écran
	 */
	@Override
	public String toString() {
		return "Calculatrice [valeurCourante=" + valeurCourante + "]";
	}

	/**
	 * Lignes d'éxécution de la classe
	 * @param args : Paramètre de la ligne de commande
	 */
	public static void main(String[] args) {
		Calculatrice calc;
		if (args.length == 0) {
			calc = new Calculatrice();
		}
		else {
			calc = new Calculatrice(Double.parseDouble(args[0]));
		}
		calc.ajoute(5);
		calc.soustrait(2);
		calc.carre();
		System.out.println(calc);
	}

}
