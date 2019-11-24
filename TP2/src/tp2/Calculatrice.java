/**
 * Cr�ation de classe : Classe Calculatrice ( Tp1-4.1)
 * Date de cr�ation : 22/09
 */

package tp2;

/**
 * Classe permettant de cr�er une calculatrice basique
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
	 * Constructeur initialisant la calculatrice � 0
	 */

	public Calculatrice() {
		this.valeurCourante = 0;
	}
	
	/**
	 * Constructeur initialisant la calculatrice 
	 * avec la valeur indiqu�e.
	 * @param value : valeur initiale pour la calculatrice
	 */
	
	public Calculatrice(double n) {
		this.valeurCourante = n;
	}
	
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
	 * M�thode d'affichage � l'�cran
	 */
	@Override
	public String toString() {
		return "Calculatrice [valeurCourante=" + valeurCourante + "]";
	}

	/**
	 * Lignes d'�x�cution de la classe
	 * @param args : Param�tre de la ligne de commande
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
