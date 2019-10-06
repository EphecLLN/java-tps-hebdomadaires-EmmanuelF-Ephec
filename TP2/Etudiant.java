/**
 * Création de classe : Classe Etudiant ( Tp1-4.2 )
 * Date de création : 22/09
 */
package tp2;

/**
 * Classe qui crée un étudiant
 * @author Foureau Emmanuel
 */
public class Etudiant {
	// Attributs
	
	private String nom;
	private String prenom;
	private int matriculeEtudiant;
	private Date date;
	
	
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
	 * @return the matriculeEtudiant
	 */
	public int getMatriculeEtudiant() {
		return matriculeEtudiant;
	}


	/**
	 * @param matriculeEtudiant the matriculeEtudiant to set
	 */
	public void setMatriculeEtudiant(int matriculeEtudiant) {
		this.matriculeEtudiant = matriculeEtudiant;
	}


	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}


	/**
	 * @param date the date to set
	 */
	public void setDate(int jour, int mois, int annee) {
		this.date = new Date(jour, mois , annee);
	}
	
	/**
	 * Initialise un étudiant
	 * @param nom = nom etudiant
	 * @param prenom = prenom etudiant
	 * @param matriculeEtudiant = matricule de l'étudiant
	 * @param jour = jour de naissance de l'étudiant
	 * @param mois = mois de naissance de l'étudiant
	 * @param annee = année de naissance de l'étudiant 
	 */

	public Etudiant(String nom, String prenom, int matriculeEtudiant, int jour, int mois, int annee) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setMatriculeEtudiant(matriculeEtudiant);
		this.setDate(jour, mois, annee);
	}
	
	
	/**
	 * Main permettant la création d'un nouvel étudiant
	 * @param args : Arguments de la ligne de commande
	 */
	 
	public static void main(String[] args) {
		Etudiant etu = new Etudiant(args[0], args[1], Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5])); // Création d'un nouvel étudiant
		// Instance des attributs avec les arguments de la ligne de commande
		System.out.println(etu.nom + " " + etu.prenom + " " + etu.matriculeEtudiant + " " + etu.date.getJour() + "/" + etu.date.getMois() + "/" + etu.date.getAnnee()); // Affichage des attributs de l'étudiant
	}

}
