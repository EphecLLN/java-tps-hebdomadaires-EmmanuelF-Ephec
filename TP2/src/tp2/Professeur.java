
/**
 * 
 */
package tp2;

/**
 * Cette classe permet de cr�er de nouveaux professeur
 * @author emman
 *
 */
public class Professeur {
	
	public String nom;
	public String prenom;
	public String specialite;
	
	
	

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}




	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}




	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}




	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	/**
	 * @return the specialite
	 */
	public String getSpecialite() {
		return specialite;
	}




	/**
	 * @param specialite the specialite to set
	 */
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	/**
	 * Cr�e un nouveau professeur avec un nom,
	 * un pr�nom et une sp�cialit�
	 * @param nom : Nom du professeur
	 * @param prenom : Pr�nom de professeur
	 * @param specialite : Sp�cialit� du professeur
	 */

	public Professeur(String nom, String prenom, String specialite) {
		setNom(nom);
		setPrenom(prenom);
		setSpecialite(specialite);
	}


	
	/**
	 * @param args : Arguments dont le nom, la pr�nom et la sp�cialit� 
	 * du professeur
	 */
	public static void main(String[] args) {
		Professeur prof1 = new Professeur("Jean", "Dupont", "programmation");

	}

}
