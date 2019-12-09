/**
 * @author <a href="mailto:gery.casiez@lifl.fr">Gery Casiez</a>
 */

package mvc_swing_jfx.model;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class TemperatureModel extends Observable {
	private double temperatureC = 20;

	public double getC(){
		return temperatureC;
	}
	public void setC(double tempC){
		temperatureC = tempC;
		setChanged();
		notifyObservers();
	}

	public double getF(){
		return temperatureC*9.0/5.0 + 32.0;
	}
	public void setF(double tempF){
		temperatureC = (tempF - 32) * 5.0 / 9.0;
		setChanged();
		notifyObservers();		
	}
}