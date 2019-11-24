/**
 * Création de classe : Classe Calculatrice ( Tp1-4.1)
 * Date de création : 22/09
 */

package tp5;

/**
 * Classe permettant de créer une calculatrice basique
 * @author Foureau Emmanuel
 */

public class Calculatrice {
	// Attributs - Variables d'instances
	private static double [] memoire = new double[10];
	private static int index = 0;
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
		Calculatrice.setMemoire(this.getValeurCourante());
	}
	
	/**
	 *  Méthode ajoutant le nombre n à la valeurCourante
	 * @param n est le nombre à ajouter -
	 */
	
	void ajoute(double n) {
		valeurCourante = valeurCourante + n;
		Calculatrice.setMemoire(this.getValeurCourante());
	}
	
	/**
	 * Méthode soustrayant le nombre n à la valeur courante
	 * @param n est le nombre à soustraire
	 */
	
	void soustrait(double n) {
		valeurCourante = valeurCourante - n;
		Calculatrice.setMemoire(this.getValeurCourante());
	}
	
	/**
	 * Méthode qui met au carré la valeurCourante
	 */
	
	void carre() {
		valeurCourante = Math.pow(valeurCourante, 2);
		Calculatrice.setMemoire(this.getValeurCourante());
	}
	
	
	/**
	 * Méthode d'affichage à l'écran
	 */
	@Override
	public String toString() {
		return "Calculatrice [valeurCourante=" + valeurCourante + "]";
	}
	
	/**
	 * Compare la valeur courante de 2 calculatrices.
	 * @param calc : Une autre calculatrice
	 * @return 0 si égaux, 1 si supèrieur, -1 si inf
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
	 * @param obj : L'autre calculatrice qui sera comparéé
	 * @return Une valeur booléenne. true si calculatrices identiques et false si diffèrentes
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
	
	public static void setMemoire (double resultat) {
			memoire[index] = resultat;
			index++;
	}

	/**
	 * Lignes d'éxécution de la classe
	 * @param args : Paramètre de la ligne de commande
	 */
	public static void main(String[] args) {
		Calculatrice calc, calc2;
		if (args.length == 0) {
			calc = new Calculatrice();
			calc2 = new Calculatrice();		}
		else {
			calc = new Calculatrice(Double.parseDouble(args[0]));
			calc2 = new Calculatrice(Double.parseDouble(args[1]));
		}
		if (calc.equals(calc2)) {
			System.out.println("Les calcs sont égaux.");
		}
		else {
			System.out.println("Les calcs sont diffèrentes.");
		}
		calc.ajoute(5);
		calc.soustrait(2);
		calc.carre();
		System.out.println(calc);
		System.out.println(memoire[index - 1 ]);  
		}

}
