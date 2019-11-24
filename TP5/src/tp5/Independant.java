/**
 * 
 */
package tp5;

/**
 * Cette classe représente un indépendant
 * @author emman
 * Date de création : 8/11/2019
 */
public class Independant extends Personne {
	// Variable d'instance
	private String numTVA;
	
	/**
	 * @param numTVA : Set num TVA
	 */
	
	public void setNumTVA(String numTVA) {
		this.numTVA = numTVA;
	}
	
	/**
	 * @return numTVA de l(objet courant
	 */
	
	public String getNumTVA () {
		return this.numTVA;
	}

	/**
	 * Permet d'afficher les valeurs des variables d'instance
	 * de l'objet courant en console
	 */
	@Override
	public String toString() {
		return "Independant [numTVA=" + numTVA + ", Nom=" + getNom() + ", Prenom=" + getPrenom()
				+ ", NumNational=" + getNumNational() + "]";
	}
	
	/**
	 * 	Constructeur de la classe "Independant"
	 * @param prenom : prénom de la personne
	 * @param nom : nom de la personne
	 * @param numNational : Numéro national de la personne
	 * @param numTVA : Numéro de TVA de la personne
	 */
	
	public Independant(String prenom, String nom, int numNational, String numTVA) {
		super(prenom, nom, numNational);
		this.setNumTVA(numTVA);
	}
	
	/**
	 * Cette méthode compare 2 objets et l'égalité 
	 * est véifiée si les 2 objets ont le même numéro national
	 */
		
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		Personne pers = (Personne) obj;
		if (pers.compareTo(this.getNumNational()) !=0) {
			return false;
		}
		return true;
	}
	
	
}



