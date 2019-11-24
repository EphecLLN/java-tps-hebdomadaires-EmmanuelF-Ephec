package tp1;

import java.util.Scanner;
import java.io.*;

public class test {

	public static void main(String[] args) {
	/*	String nomComplet = new String("Jean Dujardin");
		String [] nomSepares;
		int spaceIndex;
		nomSepares = nomComplet.split(" ");
		if (nomSepares.length < 2) {
			System.out.println("Nom incorrect !");
		}
		else {
			System.out.println("Les noms ont été separés.");
			for (int i = 0; i < nomSepares.length; i++) {
				System.out.println("Le nom à l'index " + i + " est "+ nomSepares[i]);
			}
		}
	*/
		String s = new String("Un nouvelle ligne\nPuis une autre et plus rien\n                  ");
		String [] tab = {"" , "", "" , ""};
		Scanner sc = new Scanner(s);
		int compteur = 0;
		while (sc.hasNextLine()) {
			tab[compteur] = sc.nextLine();
			System.out.println(tab[compteur]);
			compteur++;
			
		}
		
	}

}
