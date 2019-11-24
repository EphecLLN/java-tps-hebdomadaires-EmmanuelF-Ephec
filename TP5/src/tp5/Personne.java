/**
 * 
 */
package tp5;

/**
 * Cette classe représente une personne quelconque
 * @author emman
 * Date de création : 08/11/2019
 */

public class Personne {

	private String nom;
	private String prenom;
	private int numNational;
	
	
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
	 * @return the numNational
	 */
	public int getNumNational() {
		return numNational;
	}


	/**
	 * @param numNational the numNational to set
	 */
	public void setNumNational(int numNational) {
		this.numNational = numNational;
	}
	
	/**
	 * Permet de comparer les num nationaux de 2 personnes
	 * @param p = 2eme personne
	 * @return Renvoit un integer -1 plus petit, 1 : plus grand, 0 : égaux
	 */
	
	public int compareTo(int num) {
		if (this.getNumNational() > num) {
			return 1;
		}
		if (this.getNumNational() < num) {
			return -1;
		}
		return 0;
	}
	
	/**
	 * Permet de comparer l'égaité entre 2 objets
	 * @param obj est un objet à comparer
	 * @return Renvoit true si les 2 objets sont égaux, false si diffèrents
	 */

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		Personne other = (Personne) obj;
		if (this.compareTo(other.numNational) != 0) {
			return false;
		}
		return true;
	}
	
	/**
	 * Permet d'afficher en console les valeurs des variables d'instance 
	 * de l'objet courant
	 */
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", numNational=" + numNational + "]";
	}
	
	public Personne (String prenom, String nom, int numNational) {
		this.setNom(nom);
		this.setNumNational(numNational);
		this.setPrenom(prenom);
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Personne pers = new Personne("Jules", "Dupont", 123234);
		Personne emp = new Employe("Jules", "Dupont", 123234, "EPHEC", 1500);
		System.out.println(pers);
		System.out.println(emp);

	}

}
