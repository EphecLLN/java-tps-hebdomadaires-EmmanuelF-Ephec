/**
 * Création de classe : Classe Livre ( Tp1-4.4 )
 * Date de création : 29/09
 */
package tp2;

/**
 * Cette classe permet la création de livre 
 * @author Emmanuel Foureau 
 *
 */
public class Livre {
	// Attributs
	
	String titre;
	String auteur;
	String numISBN;
	

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	/**
	 * @return the numISBN
	 */
	public String getNumISBN() {
		return numISBN;
	}

	/**
	 * @param numISBN the numISBN to set
	 */
	public void setNumISBN(String numISBN) {
		this.numISBN = numISBN;
	}

	/**
	 * Initialise un nouveau livre
	 * @param titre = titre du livre 
	 * @param auteur = auteur du livre 
	 * @param numISBN = num du livre
	 */
	public Livre(String titre, String auteur, String numISBN) {
		this.setTitre(titre);
		this.setAuteur(auteur);
		this.setNumISBN(numISBN);
	}

	
	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + ", numISBN=" + numISBN + "]";
	}

	/**
	 * Création de livre
	 * @param args : Arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		Livre livre = new Livre(args[0], args[1], args[2]);
		System.out.println(livre);
	}

}
