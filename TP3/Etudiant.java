/**
 * 
 */
package tp3;

import java.util.Arrays;

/**
 * Cette classe permet la création d'un nouvel étudiant
 * @author Wololo
 * Date de création : 5/11/19
 */
public class Etudiant {
	
	// Variables d'instance 
	private String prenom, nom, matricule;
	private int [] resultats;
	private Date date;
	
	
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
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}


	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	/**
	 * @return the resultats
	 */
	public int[] getResultats() {
		return resultats;
	}


	/**
	 * @param resultats the resultats to set
	 */
	public void setResultats(int[] resultats) {
		for(int i = 0; i < 5; i++) {
			if (resultats[i] < 0 || resultats[i] > 20) {
				System.out.println("Erreur dans une des valeurs de résultats introduites.");
				this.resultats = null;
				break;
			}
		}
		this.resultats = resultats;
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
	public void setDate(Date date) {
		this.date = date;
	}
	
	/*
	 * Constructeur créant un étudiant avec :
	 * Un prénom, un nom, un matricule, des résultats et une date de naissance
	 */

	public Etudiant(String prenom, String nom, String matricule, int[] resultats, int jour, int mois, int annee) {
		this.setPrenom(prenom);
		this.setNom(nom);
		this.setMatricule(matricule);
		this.setResultats(resultats);
		this.date = new Date(jour, mois, annee);
	}

	/*
	 * Affichage des valeurs de l'objet courant
	 */

	@Override
	public String toString() {
		return "Etudiant [prenom=" + prenom + ", nom=" + nom + ", matricule=" + matricule + ", resultats="
				+ Arrays.toString(resultats) + ", date=" + date + "]";
	}
	
	/*
	 * Calcul la moyenne à partir des résultats d'examens
	 * Les points d'examens sont strictement positifs et ne dépassent pas 20
	 */
	
	public int Moyenne() {
		if (this.resultats != null) {
			int moyenne = 0;
			for (int i = 0; i < this.resultats.length; i++) {
				moyenne += this.resultats[i];
			}
			System.out.println(moyenne / this.resultats.length);
			return moyenne / this.resultats.length;
		}
		else {
			System.out.println("Pas de côtes valides pour effectuer une moyenne.");
			return 0;
		}
	}


	/**
	 * @param args : Argument reçu en paramètre permettant de créer un étudiant
	 */
	public static void main(String[] args) {
		int [] resultat = {0,0,0,0,0};
		for(int i = 3; i < 8; i++) {
			resultat[i - 3] = Integer.parseInt(args[i]);
		}
		Etudiant etu = new Etudiant(args[0], args[1], args[2], resultat,Integer.parseInt(args[8]), Integer.parseInt(args[9]), Integer.parseInt(args[10]));
		etu.Moyenne();
		System.out.println(etu);
	}

}
