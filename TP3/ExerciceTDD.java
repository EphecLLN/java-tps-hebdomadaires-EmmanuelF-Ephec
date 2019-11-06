package tp3;

public class ExerciceTDD {
	
	/**
	* Cette m�thode test si un nombre est pair ou impair 
	* @param n : Un nombre entier positif ou n�gatif 
	* @ return Un boolean : true pour un nbr positif et false si n�gatif 
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
	* Cette m�thode calcule le perimetre sur base d'un nombre 
	* @param n : Un nombre strictement positif 
	* @return Un nombre > 0, le r�sultat de calcul du p�rim�tre
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
	* Cette m�thode cherche un caract�re sp�cifique dans une cha�ne de caract�res 
	* @param char c : Le caract�re � chercher 
	* @param String s : La cha�ne de caract�re non-vide � analyser 
	* @return Un boolean : True si le caract�re est trouv� et false si l'inverse
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
		exe.contientCaractere('a', "Le caract�re est cherch�.");
	}
}