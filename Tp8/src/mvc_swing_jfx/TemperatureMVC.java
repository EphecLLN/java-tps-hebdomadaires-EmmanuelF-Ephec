package mvc_swing_jfx;
/**
 * @author <a href="mailto:gery.casiez@lifl.fr">Gery Casiez</a>
 * modified by vvds
 */

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import mvc_swing_jfx.controller.*;
import mvc_swing_jfx.model.*;
import mvc_swing_jfx.view.*;

public class TemperatureMVC {
	public TemperatureMVC(TemperatureModel model) {
		
		
		//On donne la référence à la vue pour chaque contrôleur
		
		
		
	}
	
	public static void main(String args[]) {
		
		//Create Model : 
		TemperatureModel tempmod = new TemperatureModel();
		TemperatureController tempcontrolConsole = new TemperatureController(tempmod);
		TemperatureVueConsole console = new TemperatureVueConsole(tempmod, tempcontrolConsole);
		tempcontrolConsole.addView(console);
		
		//GUI Views 
		//Schedule a job for the event-dispatching thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				TemperatureController tempcontrolC = new TemperatureController(tempmod);
				TemperatureController tempcontrolF = new TemperatureController(tempmod);
				TemperatureVueCelsius tvc = new TemperatureVueCelsius(tempmod, tempcontrolC, 100, 200);
				TemperatureVueFarenheit tvf = new TemperatureVueFarenheit(tempmod, tempcontrolF, 100, 350);
				tempcontrolC.addView(tvc);
				tempcontrolF.addView(tvf);	
			}
		});
		
		
		//Launching JavaFX business
		TemperatureController tempcontrolFX = new TemperatureController(tempmod);
		TemperatureVueGUIFX guifx = new TemperatureVueGUIFX(tempmod, tempcontrolFX);
		tempcontrolFX.addView(guifx);
        try {
			guifx.init();
			Platform.startup(() -> {
	            guifx.start(new Stage());
	        });
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        
	}
}
