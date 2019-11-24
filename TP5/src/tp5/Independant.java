/**
 * 
 */
package tp5;

/**
 * Cette classe repr�sente un ind�pendant
 * @author emman
 * Date de cr�ation : 8/11/2019
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
	 * @param prenom : pr�nom de la personne
	 * @param nom : nom de la personne
	 * @param numNational : Num�ro national de la personne
	 * @param numTVA : Num�ro de TVA de la personne
	 */
	
	public Independant(String prenom, String nom, int numNational, String numTVA) {
		super(prenom, nom, numNational);
		this.setNumTVA(numTVA);
	}
	
	/**
	 * Cette m�thode compare 2 objets et l'�galit� 
	 * est v�ifi�e si les 2 objets ont le m�me num�ro national
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



