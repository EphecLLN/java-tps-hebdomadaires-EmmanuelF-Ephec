/**
 * Création de classe : Classe Etudiant ( Tp1-4.2 )
 * Date de création : 22/09
 */
package tp4;

import tp4.Etudiant;

/**
 * Classe qui crée un étudiant
 * @author Foureau Emmanuel
 */
public class Etudiant {
	// Attributs
	
	private String nom;
	private String prenom;
	private int matriculeEtudiant;
	private static int nbEtudiants = 0;
	
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
	 * Initialise un étudiant
	 * @param nom = nom etudiant
	 * @param prenom = prenom etudiant
	 * @param matriculeEtudiant = matricule de l'étudiant
	 */

	public Etudiant(String nom, String prenom) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setMatriculeEtudiant(nbEtudiants);
		nbEtudiants++;
	}
	
	
	/**
	 * Permet d'afficher les valeurs courantes de l'objet
	 */
	
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", matriculeEtudiant=" + matriculeEtudiant + "]";
	}
	
	/**
	 * Compare les matricules de 2 étudiants 
	 * @param Objet donc on compare une variable d'instance
	 * @return Renvoit un entier 
	 */
	
	public int compareTo(Etudiant obj) {
		if (this.matriculeEtudiant < obj.matriculeEtudiant) {
			return -1;
		}
		if (this.matriculeEtudiant > obj.matriculeEtudiant) {
			return 1;
		}
		return 0;
	}
	
	/**
	 * Compare 2 objets pour vérifier l'égalité
	 * @param Objet qui doit être comparé
	 * @return Valeur booléenne : true si même objet et false si diffèrent
	 */
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		Etudiant other = (Etudiant) obj;
		if (this.compareTo(other) != 0) {
			return false;
		}
		return true;
	}
	
	private static int getNbEtudiants() {
		System.out.println("Il y a " + nbEtudiants + " étudiant(s).");
		return nbEtudiants;
	}


	/**
	 * Main permettant la création d'un nouvel étudiant
	 * @param args : Arguments de la ligne de commande
	 */
	 
	public static void main(String[] args) {
		Etudiant etu = new Etudiant(args[0], args[1]); // Création d'un nouvel étudiant
		Etudiant etu2 = new Etudiant(args[2], args[3]);
		if (etu.equals(etu2)) {
			System.out.println("Ils sont identiques.");
		}
		else {
			System.out.println("Il sont diffèrents.");
		}
		Etudiant.getNbEtudiants();
		// Instance des attributs avec les arguments de la ligne de commande
		System.out.println(etu); // Affichage des attributs de l'étudiant
	}

}
