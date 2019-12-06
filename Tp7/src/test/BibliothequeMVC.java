package test;

import controller.BibliothequeController;
import model.Bibliotheque;
import view.BibliothequeVue;
import view.BibliothequeVueConsole;
import view.BibliothequeVueGUI;

public class BibliothequeMVC {
	public BibliothequeMVC() {
		//Cr�ation du mod�le
		
		Bibliotheque biblio = new Bibliotheque();

		//Cr�ation des contr�leurs : Un pour chaque vue
		//Chaque contr�leur doit avoir une r�f�rence vers le mod�le pour pouvoir le commander
		
		BibliothequeController controllerConsole = new BibliothequeController(biblio);
		BibliothequeController controllerGUI = new BibliothequeController(biblio);
		
		//Cr�ation des vues.
		//Chaque vue doit conna�tre son contr�leur et avoir une r�f�rence vers le mod�le pour pouvoir l'observer
		
		BibliothequeVueConsole biblioConsole = new BibliothequeVueConsole(biblio, controllerConsole);
		BibliothequeVueGUI biblioGUI = new BibliothequeVueGUI(biblio, controllerGUI, 0 , 0);
		
		//On donne la r�f�rence � la vue pour chaque contr�leur
		
		biblio.addObserver(biblioConsole);
		biblio.addObserver(biblioGUI);
		
		
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
