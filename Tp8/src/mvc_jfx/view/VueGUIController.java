package mvc_jfx.view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import mvc_jfx.model.Temperature;

public class VueGUIController {
	@FXML
	private TextField field;
	private Temperature model; 
	
	@FXML
    private void initialize() {
		field.textProperty().addListener((observable, oldValue, newValue) -> {
		    this.model.setTemperatureC(Double.valueOf(newValue));
		});
        
    }
	
	@FXML
	private void increaseTemp() {
		this.model.setTemperatureC(this.model.getTemperatureC()+1);
	}
	@FXML
	private void decreaseTemp() {
		this.model.setTemperatureC(this.model.getTemperatureC()-1);
	}
	
	public void setModel(Temperature t) {
		this.model=t;
		field.textProperty().bind(model.temperatureCProperty().asString());
	}

}
