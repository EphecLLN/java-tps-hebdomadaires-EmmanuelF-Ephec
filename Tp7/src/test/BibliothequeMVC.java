package test;

import controller.BibliothequeController;
import model.Bibliotheque;
import view.BibliothequeVue;
import view.BibliothequeVueConsole;
import view.BibliothequeVueGUI;

public class BibliothequeMVC {
	public BibliothequeMVC() {
		//Cr�ation du mod�le
		
		//TODO

		//Cr�ation des contr�leurs : Un pour chaque vue
		//Chaque contr�leur doit avoir une r�f�rence vers le mod�le pour pouvoir le commander
		
		//TODO
		
		//Cr�ation des vues.
		//Chaque vue doit conna�tre son contr�leur et avoir une r�f�rence vers le mod�le pour pouvoir l'observer
		
		//TODO
		
		//On donne la r�f�rence � la vue pour chaque contr�leur
		
		//TODO
		
		
	}
	
	public static void main(String args[]) {
		//Schedule a job for the event-dispatching thread:
		//creating and showing this application's GUI.
		Bibliotheque biblio = new Bibliotheque();
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new BibliothequeMVC();
			}
		});
	}
}
