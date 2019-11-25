

package tp6;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public abstract class Personne {
	private String nom, prenom;
	private Date dateNaissance, dateArrivee;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		
		this.dateNaissance = dateNaissance;
	}
	public Date getDateArrivee() {
		return dateArrivee;
	}
	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}
	
	public int age() {
		Date dateActuelle = new Date();
		int age = dateActuelle.getYear() - this.getDateNaissance().getYear();
		if ((this.getDateNaissance().getMonth() > dateActuelle.getMonth()) || (this.getDateNaissance().getDate() >= dateActuelle.getDate() && this.getDateNaissance().getMonth() == dateActuelle.getMonth())) {
			age++;
		}
		return age;
	}
	
	
	
	public abstract int anciennete();
	
	public Personne(String nom, String prenom, String dateNaissance, String dateArrivee) {
		this.setNom(nom);
		this.setPrenom(prenom);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.setDateNaissance(formatter.parse(dateNaissance));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.setDateArrivee(formatter.parse(dateArrivee));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) { 
		Professeur prof = new Professeur("Jules", "Jules", "24/11/1998", "26/10/1998");
		System.out.println(prof.age());
	}
}
