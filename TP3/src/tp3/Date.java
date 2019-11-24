/**
 * 
 */
package tp3;

/**
 * Cette classe permet de créer une date
 * @author Wololo
 * Date de création : 5/11/19
 */
public class Date {
	
	// Variable d'instance
	public String dateNaissance;
	
	/*
	 * @param Date : Date servant de date de naissance
	 * Cette méthode sert de setter
	 */
	
	public void setDateNaissance(String date) {
		this.dateNaissance = date;
	}
	
	/*
	 * Cette méthode sert de getter
	 * @return String : Renvoit la date de naissance de l'objet demandé
	 */
	
	public String getDateNaissance() {
		return this.dateNaissance;
	}
	
	/*
	 * Constructeur de la classe Date 
	 * @param jour : Jour de la date de naissance Compris entre 1 et 31
	 * @param mois : Mois de la date de naissance Compris entre 1 et 12
	 * @param annee = Année de la date de naissance Inférieur à l'année courante
	 */
	
	public Date(int jour, int mois, int annee) {
		if (jour > 0 && jour < 32 || mois > 0 && mois < 13 || annee < 2020) {
			this.dateNaissance = Integer.toString(jour) + "/"  + Integer.toString(mois) + "/" + Integer.toString(annee);
		}
		else {
			System.out.println("Erreur dans la création de la date. Valeurs incorrectes.");
		}
	}
}
