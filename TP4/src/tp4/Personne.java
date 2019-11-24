/**
 * 
 */
package tp4;

/**
 * @author HE201607
 *
 */
public class Personne {
	
	private String nom;
	private String prenom;
	
	

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

	public Personne(String nom, String prenom) {
		setNom(nom);
		setPrenom(prenom);
	}
	
	/**¨
	 * Permet d'afficher les valeurs des variables d'instance en console
	 */

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	/**
	 * Permet de vérifier si deux objets sont égaux ou 
	 * si leurs variables d'instance sont égaux
	*/
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		Personne other = (Personne) obj;
		if (other.prenom== null && this.prenom!= null) {
			return false;
		}
		if (this.prenom.compareTo(other.prenom) != 0) {
			return false;
		}
		if (other.nom == null && this.nom != null) {
			return false;
		}
		if (this.nom.compareTo(other.nom) != 0) {
			return false;
		}
		return true;
	}

	/**
	 * @param args = Arguments dont le nom et le prénom
	 */
	public static void main(String[] args) {
		Personne personne1 = new Personne(args[0], args[1]);
		Personne personne2 = new Personne(args[2], args[3]);
		if (personne1.equals(personne2)) {
			System.out.println("Les 2 personnes sont identiques.");
		}
		else {
			System.out.println("Les 2 personnes sont diffèrentes.");
		}
	}

}
