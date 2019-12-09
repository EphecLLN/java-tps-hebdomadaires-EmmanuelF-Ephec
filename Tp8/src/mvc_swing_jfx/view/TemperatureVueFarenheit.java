/**
 * @author <a href="mailto:gery.casiez@lifl.fr">Gery Casiez</a>
 */

package mvc_swing_jfx.view;

import java.util.Observable;
import java.awt.event.*;

import mvc_swing_jfx.controller.*;
import mvc_swing_jfx.model.*;

public class TemperatureVueFarenheit extends TemperatureVueGUI {
	public TemperatureVueFarenheit(TemperatureModel modele,
			TemperatureController controleur, int posX, int posY) {
		super("Temperature Farenheit",modele, controleur, posX, posY);
		setDisplay(""+model.getF());
		addUpListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.augmenteDegresF();
			}});
		addDownListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.diminueDegresF();
			}});
		addDisplayListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tempF = getDisplay();
				controller.fixeDegresF(tempF);
			}});
	}

	public void update(Observable s, Object o) {
		setDisplay(""+model().getF());
	}
}
