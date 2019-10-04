/**
 * Création de classe : Classe Livre ( Tp1-4.4 )
 * Date de création : 29/09
 */
package tp1;

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
	 * Création de livre
	 * @param args : Arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		Livre livre = new Livre();
		livre.titre = args[0];
		livre.auteur = args[1];
		livre.numISBN = args[2];
		System.out.println("Le livre " + livre.titre + " écrit par " + livre.auteur + " possède le numéro ISBN suivant : " + livre.numISBN + ".");
	}

}
