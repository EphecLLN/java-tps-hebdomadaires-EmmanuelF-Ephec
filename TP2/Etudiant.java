/**
 * Cr�ation de classe : Classe Etudiant ( Tp1-4.2 )
 * Date de cr�ation : 22/09
 */
package tp2;

import tp2.Etudiant;

/**
 * Classe qui cr�e un �tudiant
 * @author Foureau Emmanuel
 */
public class Etudiant {
	// Attributs
	
	private String nom;
	private String prenom;
	private int matriculeEtudiant;
	
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
	 * Initialise un �tudiant
	 * @param nom = nom etudiant
	 * @param prenom = prenom etudiant
	 * @param matriculeEtudiant = matricule de l'�tudiant
	 */

	public Etudiant(String nom, String prenom, int matriculeEtudiant) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setMatriculeEtudiant(matriculeEtudiant);
	}
	
	
	
	
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", matriculeEtudiant=" + matriculeEtudiant + "]";
	}


	/**
	 * Main permettant la cr�ation d'un nouvel �tudiant
	 * @param args : Arguments de la ligne de commande
	 */
	 
	public static void main(String[] args) {
		Etudiant etu = new Etudiant(args[0], args[1], Integer.parseInt(args[2])); // Cr�ation d'un nouvel �tudiant
		// Instance des attributs avec les arguments de la ligne de commande
		System.out.println(etu); // Affichage des attributs de l'�tudiant
	}

}
