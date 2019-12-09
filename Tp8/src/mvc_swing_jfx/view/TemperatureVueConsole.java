package mvc_swing_jfx.view;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

import mvc_swing_jfx.controller.TemperatureController;
import mvc_swing_jfx.model.TemperatureModel;


public class TemperatureVueConsole implements TemperatureVue {
	protected Scanner sc;
	protected TemperatureModel model;
	protected TemperatureController controller;
	
	public TemperatureVueConsole(TemperatureModel model,
			TemperatureController controller) {
		this.model = model;
		this.controller = controller;
		model.addObserver(this);
		sc = new Scanner(System.in);
		new Thread (new ReadInput()).start();	
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(model.getC());
		
	}
	public void enableWarning(){
		System.out.println("Alerte");
	}
	public void disableWarning(){	
	}

	
	private class ReadInput implements Runnable{
		public void run() {
			while(true){
				int newCTemp = sc.nextInt();
				controller.fixeDegresC(newCTemp);
			}
		}
	}

}
