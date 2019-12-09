package mvc_jfx;

import java.io.IOException;

import mvc_jfx.model.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import mvc_jfx.model.Temperature;
import mvc_jfx.view.VueGUIController;

public class MainApp extends Application {
	private Stage primaryStage;
	@Override
    public void start(Stage primaryStage) {
		//First, create the model : 
    	Temperature thermostat = new Temperature();
    	
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Mon Thermostat");
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/VueGUI.fxml"));
            BorderPane rootLayout = (BorderPane) loader.load();
            VueGUIController vueCtrl = loader.getController();
            vueCtrl.setModel(thermostat);
            
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
	
    public static void main(String[] args) {
    	
    	
    	
        launch(args);
    }	
}
