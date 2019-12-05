package model;

public class Livre {
	private String name;
	private boolean estEmprunte = false;
	public Livre(String name) {
		super();
		this.name = name;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return true si le livre est en pr�t
	 */
	public boolean estEmprunte() {
		return estEmprunte;
	}
	/**
	 * Emprunte le livre s'il ne l'est pas d�j�
	 * @return true si l'emprunt a pu �tre effectu�e
	 */
	public boolean emprunte() {
		if(estEmprunte) return false;
		else {
			estEmprunte = true;
			return true;
		}
	}
	public void rendre(){
		estEmprunte = false;
	}
	public String toString(){
		return getName() + " : " + (estEmprunte() ? "Emprunt�" : "Disponible");
	}
	
	 

}