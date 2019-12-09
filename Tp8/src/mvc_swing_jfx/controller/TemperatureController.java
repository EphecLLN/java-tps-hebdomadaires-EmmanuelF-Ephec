/**
 * @author <a href="mailto:gery.casiez@lifl.fr">Gery Casiez</a>
 * Modified by vvds 
 */

package mvc_swing_jfx.controller;

import mvc_swing_jfx.model.*;
import mvc_swing_jfx.view.*;



public class TemperatureController {
	private TemperatureModel model;
	private TemperatureVue view = null;
	

	public TemperatureController(TemperatureModel m) {
		model = m;
	}

	public void augmenteDegresC(){
		
		model.setC(model.getC()+1);
		control();
		
	}

	public void diminueDegresC(){
		model.setC(model.getC()-1);
		control();
		
	}

	public void fixeDegresC(double tempC){

		model.setC(tempC);
		control();
		
	}

	public void augmenteDegresF(){
		
		model.setF(model.getF()+1);
		control();
	}

	public void diminueDegresF(){
		
		model.setF(model.getF()-1);
		control();
	}

	public void fixeDegresF(double tempF){
		
		model.setF(tempF);
		control();
	}
	/**
	 * When the user set a temperature too high, the corresponding view must display a warning
	 * (note : other views are not notified of the warning)
	 */
	public void control() {
		if (view != null) {
			if (model.getC() > 40.0) {
				view.enableWarning();
			} else {
				view.disableWarning();
			}
		}
	}

	public void addView(TemperatureVue view) {
		this.view = view;
	}
}
