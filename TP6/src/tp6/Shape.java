/**
 * 
 */
package tp6;

/**
 * @author Wololo
 *
 */
public abstract class Shape {
	int id, x, y;
	private static int compteur = 1;
	
	public abstract int surface();
	public abstract int perimetre();
	
	public String getNom() {
		return this.getClass().getSimpleName() + "-" + this.getId();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Shape(int x, int y) {
		this.setX(x);
		this.setY(y);
		this.setId(compteur);
		compteur++;
	}
	
	
	
	@Override
	public String toString() {
		return "Shape [id=" + id + ", x=" + x + ", y=" + y + ", surface()=" + surface() + ", perimetre()=" + perimetre()
				+ ", getNom()=" + getNom()+ "]";
	}
	
	public static void main(String[] args) {
		Carre test = new Carre(1,2,4);
		System.out.println(test);
		Cercle testCercle = new Cercle(1,2,4);
		System.out.println(testCercle);
	}
}
