/**
 * Création de classe : Classe Date ( Tp1-4.3 )
 * Date de création : 29/09
 */
package tp1;

/**
 * Cette classe permet de créer une date de naissance
 * @author Emmanuel Foureau
 *
 */
public class Date {
	 //Attributs - Variables d'instance
	int jour; 
	int mois;
	int annee;
	
	public Date(int jour, int mois, int annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	
	public static boolean between(int min, int max, int number) {
		if (number > min && number < max) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * @param args : Arguments de la ligne de commande
	 */
	public static void main(String[] args) { 
		if (between(0, 32, Integer.parseInt(args[0])) && between(0, 13, Integer.parseInt(args[1])) && Integer.parseInt(args[2]) < 2020) 	{
			Date date = new Date(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
			System.out.println("La date de naissance est le : " + date.jour + "/" + date.mois + "/" + date.annee);
		}
		else {
			System.out.println("Une des valeurs rentrées est incorrecte.");
		}
	}
	
}
