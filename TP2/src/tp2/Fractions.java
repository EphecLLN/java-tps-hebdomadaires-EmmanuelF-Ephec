/**
 * 
 */
package tp2;

/**
 * Cette classe permet de créer une fraction 
 * avec un numérateur et un dénominateur
 * @author emman
 */
public class Fractions {
	
	private int numerateur;
	private int denominateur;
	
	
	
	/**
	 * @return the numerateur
	 */
	public int getNumerateur() {
		return numerateur;
	}

	/**
	 *
	 * @param numerateur the numerateur to set
	 */
	public void setNumerateur(int numerateur) {
		this.numerateur = numerateur;
	}

	/**
	 * Permet d'accéder à la valeur dénominateur
	 * @return the denominateur
	 */
	public int getDenominateur() {
		return denominateur;
	}

	/**
	 * Permet d'initialiser le denominateur 
	 * denominateur != 0
	 * @param denomitateur the denomitateur to set
	 */
	public void setDenominateur(int denominateur) {
		if (denominateur == 0) {
			System.out.println("Le dénominateur vaut 0");
		}
		else {
		this.denominateur = denominateur;
		}
	}
	
	/**
	 * Ce constructeur initialise la fraction 
	 * avec un numérateur et un dénominateur 
	 * et appelle la méthode de simplification
	 * @param numerateur
	 * @param denominateur
	 */

	public Fractions(int numerateur, int denominateur) {
		setNumerateur(numerateur);
		setDenominateur(denominateur);
		simplification(numerateur, denominateur);
	}
	
	/**
	 * Cette méthode simplifie la fraction au maximum
	 * @param numerateur : Numérateur de la fraction 
	 * @param denominateur : Dénominateur de la fraction
	 */
	
	public void simplification(int numerateur, int denominateur) {
		int division = numerateur / denominateur;
		if (division  % 1 == 0) {
			setNumerateur(numerateur / division);
			setDenominateur(denominateur / division);
		}
		else {
			System.out.println("erreur");
		}
	}
	
	/**
	 * Cette méthode permet d'afficher la valeur réelle de la fraction.
	 */
	
	public void getValeurReelle() {
		System.out.println(this.numerateur/ this.denominateur);
	}

	/**
	 * Cette méthode permet l'affichage de ce 
	 * que contient l'objet fraction
	 */
	
	@Override
	public String toString() {
		String str = "";
		if (this.denominateur == 1) {
			str = "Le nombre est : " + this.numerateur;
		}
		else {
			str = "La fraction est : " + this.numerateur + "/" + this.denominateur;
		}
		return str;
	}

	/**
	 * @param args : arguments dont le dénominateur et le numérateur
	 */
	public static void main(String[] args) {
		Fractions fraction = new Fractions(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		System.out.println(fraction);
	}

}
