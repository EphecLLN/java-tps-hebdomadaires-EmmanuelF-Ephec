/**
 * Cr�ation de classe : Classe Etudiant ( Tp1-4.2 )
 * Date de cr�ation : 22/09
 */
package tp1;

/**
 * Classe qui cr�e un �tudiant
 * @author Foureau Emmanuel
 */
public class Etudiant {
	// Attributs
	
	String nom;
	String prenom;
	int matriculeEtudiant;
	Date date;
	

	/**
	 * Main permettant la cr�ation d'un nouvel �tudiant
	 * @param args : Arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		Etudiant etu = new Etudiant(); // Cr�ation d'un nouvel �tudiant
		// Instance des attributs avec les arguments de la ligne de commande
		etu.nom = args[0];
		etu.prenom = args[1];
		etu.matriculeEtudiant = Integer.parseInt(args[2]);
		etu.date = new Date(Integer.parseInt(args[3]), Integer.parseInt(args[4]),Integer.parseInt(args[5]));
		
		System.out.println(etu.nom + " " + etu.prenom + " " + etu.matriculeEtudiant + " " + etu.date); // Affichage des attributs de l'�tudiant
	}

}
