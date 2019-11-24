/**
 * Cr�ation de classe : Classe Etudiant ( Tp1-4.2 )
 * Date de cr�ation : 22/09
 */
package tp4;

import tp4.Etudiant;

/**
 * Classe qui cr�e un �tudiant
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
	 * Initialise un �tudiant
	 * @param nom = nom etudiant
	 * @param prenom = prenom etudiant
	 * @param matriculeEtudiant = matricule de l'�tudiant
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
	 * Compare les matricules de 2 �tudiants 
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
	 * Compare 2 objets pour v�rifier l'�galit�
	 * @param Objet qui doit �tre compar�
	 * @return Valeur bool�enne : true si m�me objet et false si diff�rent
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
		System.out.println("Il y a " + nbEtudiants + " �tudiant(s).");
		return nbEtudiants;
	}


	/**
	 * Main permettant la cr�ation d'un nouvel �tudiant
	 * @param args : Arguments de la ligne de commande
	 */
	 
	public static void main(String[] args) {
		Etudiant etu = new Etudiant(args[0], args[1]); // Cr�ation d'un nouvel �tudiant
		Etudiant etu2 = new Etudiant(args[2], args[3]);
		if (etu.equals(etu2)) {
			System.out.println("Ils sont identiques.");
		}
		else {
			System.out.println("Il sont diff�rents.");
		}
		Etudiant.getNbEtudiants();
		// Instance des attributs avec les arguments de la ligne de commande
		System.out.println(etu); // Affichage des attributs de l'�tudiant
	}

}
