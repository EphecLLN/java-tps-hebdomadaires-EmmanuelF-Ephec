package test;

import controller.BibliothequeController;
import model.Bibliotheque;
import view.BibliothequeVue;
import view.BibliothequeVueConsole;
import view.BibliothequeVueGUI;

public class BibliothequeMVC {
	public BibliothequeMVC() {
		//Création du modèle
		
		Bibliotheque biblio = new Bibliotheque();

		//Création des contrôleurs : Un pour chaque vue
		//Chaque contrôleur doit avoir une référence vers le modèle pour pouvoir le commander
		
		BibliothequeController controllerConsole = new BibliothequeController(biblio);
		BibliothequeController controllerGUI = new BibliothequeController(biblio);
		
		//Création des vues.
		//Chaque vue doit connaître son contrôleur et avoir une référence vers le modèle pour pouvoir l'observer
		
		BibliothequeVueConsole biblioConsole = new BibliothequeVueConsole(biblio, controllerConsole);
		BibliothequeVueGUI biblioGUI = new BibliothequeVueGUI(biblio, controllerGUI, 0 , 0);
		
		//On donne la référence à la vue pour chaque contrôleur
		
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
