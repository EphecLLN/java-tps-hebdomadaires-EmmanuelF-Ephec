package mvc_jfx.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Temperature {
	
	private DoubleProperty temperatureC;
	
	public Temperature() {
		temperatureC = new SimpleDoubleProperty(20.0);
	}
	public double getTemperatureC(){
		return temperatureC.getValue();
	}
	public void setTemperatureC(double tempC){
		temperatureC.set(tempC);
	}
	public double getTemperatureF(){
		return getTemperatureC()*9.0/5.0 + 32.0;
	}
	public void setTemperatureF(double tempF){
		setTemperatureC((tempF - 32) * 5.0 / 9.0);	
	}
	public DoubleProperty temperatureCProperty() {
        return temperatureC;
    }
	
}	