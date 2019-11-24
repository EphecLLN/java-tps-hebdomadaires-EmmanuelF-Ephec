/**
 * 
 */
package tp5;

/**
 * Cette classe représente un employé
 * @author emman
 * Date de création : 8/11/2019
 */
public class Employe extends Personne{
	private int salaire;
	private String employeur;
	
	/**
	 * Permet de comparer 2 
	 */
	
	/*
	public int compareTo(int num) {
	if (this.getNumNational() > num) {
		return 1;
	}
	if (this.getNumNational() < num) {
		return -1;
	}
	return 0;	
	}
	*/
	
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	/**
	 * Permet d'afficher les valeurs des variables d'instance
	 * de l'objet courant.
	 * 
	 */
	@Override
	public String toString() {
		return "Employe [salaire=" + salaire + ", employeur=" + employeur + ", Nom=" + getNom() + ", Prenom="
				+ getPrenom() + ", NumNational=" + getNumNational() + "]";
	}
	
	/**
	 * Set salaire dans l'objet courant
	 * @param salaire : Le nouveau salaire de l'objet courant
	 */
	
	public void setSalaire (int salaire) {
		this.salaire = salaire;
	}
	
	/**
	 * Renvoit le salaire actuel
	 * @return Salaire de l'objet courant
	 */
	
	public int getSalaire () {
		return this.salaire;
	}
	
	/**
	 * Définit la variable d'instance employeur de l'objet courant
	 * @param employeur : Le nouvel employeur de l'objet courant 
	 */
	
	public void setEmployeur (String employeur) {
		this.employeur = employeur;
	}
	
	/**
	 * Renvoit la valeur de la variable d'instance de l'objet courant 
	 * @return employeur : L'employeur de l'objet courant
	 */
	
	public String getEmployeur () {
		return this.employeur;
	}
	
	public Employe(String prenom, String nom, int numNational, String employeur, int salaire) {
		super(prenom, nom, numNational);
		this.setSalaire(salaire);
		this.setEmployeur(employeur);
	}
	
	public static void main(String [] args){
		Personne pers = new Personne("Paul", "Dupont", 123234);
		Personne emp = new Employe("Jules", "Dupont", 123234, "EPHEC", 1500);
	
		System.out.println(pers);
		System.out.println(emp);
	
		}
}
