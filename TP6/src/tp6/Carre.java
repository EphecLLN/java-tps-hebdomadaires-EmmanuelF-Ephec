/**
 * 
 */
package tp6;

/**
 * @author Wololo
 *
 */
public class Carre extends Shape {
	int longueurCote;
	
	public void setLongueurCote(int longueurCote) {
		if (!(longueurCote <= 0)) {
		this.longueurCote = longueurCote;
		}
		else {
			System.out.println("Un carré a une longueur strictement supèrieur à 0.");
		}
	}
	
	public int getLongueurCote() {
		return this.longueurCote;
	}
	
	public Carre(int x, int y, int longueurCote) {
		super(x,y);
		this.setLongueurCote(longueurCote);
	}
	
	public int perimetre() {
		return this.longueurCote * 4;
	}
	
	public int surface() {
		return (int) Math.pow(this.getLongueurCote(), 2);
	}
}
