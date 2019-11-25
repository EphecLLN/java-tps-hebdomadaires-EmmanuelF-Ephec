package tp6;

public class Cercle extends Shape {

	int rayon;
	
	public int surface() {
		return (int) Math.floor(Math.PI * Math.pow(this.getRayon(), 2));
	}
	
	public int perimetre() {
		return (int) Math.floor(Math.PI * 2 * this.getRayon());
	}
	
	public void setRayon(int rayon) {
		if (!(rayon <= 0)) {
			this.rayon = rayon;
		}
		else {
			System.out.println("La valeur d'un rayon est strictement supèrieur à 0.");
		}
	}
	
	public int getRayon() {
		return this.rayon;
	}
	
	public Cercle(int x, int y, int rayon) {
		super(x,y);
		this.setRayon(rayon);
	}
}
