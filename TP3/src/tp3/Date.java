/**
 * 
 */
package tp3;

/**
 * Cette classe permet de cr�er une date
 * @author Wololo
 * Date de cr�ation : 5/11/19
 */
public class Date {
	
	// Variable d'instance
	public String dateNaissance;
	
	/*
	 * @param Date : Date servant de date de naissance
	 * Cette m�thode sert de setter
	 */
	
	public void setDateNaissance(String date) {
		this.dateNaissance = date;
	}
	
	/*
	 * Cette m�thode sert de getter
	 * @return String : Renvoit la date de naissance de l'objet demand�
	 */
	
	public String getDateNaissance() {
		return this.dateNaissance;
	}
	
	/*
	 * Constructeur de la classe Date 
	 * @param jour : Jour de la date de naissance Compris entre 1 et 31
	 * @param mois : Mois de la date de naissance Compris entre 1 et 12
	 * @param annee = Ann�e de la date de naissance Inf�rieur � l'ann�e courante
	 */
	
	public Date(int jour, int mois, int annee) {
		if (jour > 0 && jour < 32 || mois > 0 && mois < 13 || annee < 2020) {
			this.dateNaissance = Integer.toString(jour) + "/"  + Integer.toString(mois) + "/" + Integer.toString(annee);
		}
		else {
			System.out.println("Erreur dans la cr�ation de la date. Valeurs incorrectes.");
		}
	}
}
