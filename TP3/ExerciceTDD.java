package tp3;

public class ExerciceTDD {
	
	/**
	* Cette méthode test si un nombre est pair ou impair 
	* @param n : Un nombre entier positif ou négatif 
	* @ return Un boolean : true pour un nbr positif et false si négatif 
	*/
	public boolean estPair(int n) {
		if (n % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/** 
	* Cette méthode calcule le perimetre sur base d'un nombre 
	* @param n : Un nombre strictement positif 
	* @return Un nombre > 0, le résultat de calcul du périmètre
	*/
	public int perimetreCarre(int n) {
		if (n > 0) {
			return n*4;
		}
		else {
			return 0;
		}
	}
	
	/**
	* Cette méthode cherche un caractère spécifique dans une chaîne de caractères 
	* @param char c : Le caractère à chercher 
	* @param String s : La chaîne de caractère non-vide à analyser 
	* @return Un boolean : True si le caractère est trouvé et false si l'inverse
	*/
	@SuppressWarnings("null")
	public boolean contientCaractere(char c, String s) {
		if (s.length() > 0) {
			if (s.indexOf(c) > -1) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		ExerciceTDD exe = new ExerciceTDD();
		exe.contientCaractere('a', "Le caractère est cherché.");
	}
}