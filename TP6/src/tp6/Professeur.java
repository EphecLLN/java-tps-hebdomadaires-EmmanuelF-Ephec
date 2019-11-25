/**
 * 
 */
package tp6;

import java.util.*;
/**
 * @author Wololo
 *
 */
public class Professeur extends Personne{
	private static int ageMin = 23;
	
	public Professeur (String nom, String prenom, String dateNaissance, String dateArrivee) {
		super(nom, prenom, dateNaissance, dateArrivee); 
	}

	public int anciennete() {
		int year = this.getDateArrivee().getYear();
		Date dateActuelle = new Date();
		int actualYear = dateActuelle.getYear();
		if (this.age() >= ageMin && (this.age() - (this.age() - (actualYear - year)) >= ageMin )) {
			return actualYear - year;
		}
		else {
			return this.age() - ageMin;
		}
	}
}
