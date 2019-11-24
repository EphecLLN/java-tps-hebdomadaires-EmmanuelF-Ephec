/**
 * Cr�ation de classe : Classe Calculatrice ( Tp1-4.1)
 * Date de cr�ation : 22/09
 */

package tp4;

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
	 * Compare la valeur courante de 2 calculatrices.
	 * @param calc : Une autre calculatrice
	 * @return 0 si �gaux, 1 si sup�rieur, -1 si inf
	 */
	
	public int compareTo(Calculatrice calc) {
		if (valeurCourante < calc.valeurCourante) {
			return -1;
		}
		if (valeurCourante > calc.valeurCourante) {
			return 1;
		}
		return 0;
	}
	
	/**
	 * Permet de comparer 2 calculettes + les test de base
	 * @param obj : L'autre calculatrice qui sera compar��
	 * @return Une valeur bool�enne. true si calculatrices identiques et false si diff�rentes
	 */
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		Calculatrice other = (Calculatrice) obj;
		if (this.compareTo(other) != 0) {
			return false;
		}
		return true;
	}

	/**
	 * Lignes d'�x�cution de la classe
	 * @param args : Param�tre de la ligne de commande
	 */
	public static void main(String[] args) {
		Calculatrice calc, calc2;
		if (args.length == 0) {
			calc = new Calculatrice();
			calc2 = new Calculatrice();		}
		else {
			calc = new Calculatrice(Double.parseDouble(args[0]));
			calc2 = new Calculatrice(Double.parseDouble(args[2]));
		}
		if (calc.equals(calc2)) {
			System.out.println("Les calcs sont �gaux.");
		}
		else {
			System.out.println("Les calcs sont diff�rentes.");
		}
		calc.ajoute(5);
		calc.soustrait(2);
		calc.carre();
		System.out.println(calc);
	}

}
