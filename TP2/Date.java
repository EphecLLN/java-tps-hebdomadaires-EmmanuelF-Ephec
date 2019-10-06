/**
 * Création de classe : Classe Date ( Tp1-4.3 )
 * Date de création : 29/09
 */
package tp2;

/**
 * Cette classe permet de créer une date de naissance
 * @author Emmanuel Foureau
 *
 */
public class Date {
	 //Attributs - Variables d'instance
	private int jour; 
	private int mois;
	private int annee;
	
	/**
	 * @return the jour
	 */
	public int getJour() {
		return jour;
	}

	/**
	 * @param jour the jour to set
	 */
	public void setJour(int jour) {
		this.jour = jour;
	}

	/**
	 * @return the mois
	 */
	public int getMois() {
		return mois;
	}

	/**
	 * @param mois the mois to set
	 */
	public void setMois(int mois) {
		this.mois = mois;
	}

	/**
	 * @return the annee
	 */
	public int getAnnee() {
		return annee;
	}

	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}

	/**
	 * constructeur initialisant la date de naissance
	 * @param jour = jour de naissance 
	 * @param mois = mois de naissance 
	 * @param annee = annee de naissance
	 */
	
	public Date(int jour, int mois, int annee) {
		this.setJour(jour);
		this.setMois(mois);
		this.setAnnee(annee);
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
