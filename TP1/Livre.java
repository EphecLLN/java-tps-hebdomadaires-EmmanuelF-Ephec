/**
 * Cr�ation de classe : Classe Livre ( Tp1-4.4 )
 * Date de cr�ation : 29/09
 */
package tp1;

/**
 * Cette classe permet la cr�ation de livre 
 * @author Emmanuel Foureau 
 *
 */
public class Livre {
	// Attributs
	
	String titre;
	String auteur;
	String numISBN;

	/**
	 * Cr�ation de livre
	 * @param args : Arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		Livre livre = new Livre();
		livre.titre = args[0];
		livre.auteur = args[1];
		livre.numISBN = args[2];
		System.out.println("Le livre " + livre.titre + " �crit par " + livre.auteur + " poss�de le num�ro ISBN suivant : " + livre.numISBN + ".");
	}

}
