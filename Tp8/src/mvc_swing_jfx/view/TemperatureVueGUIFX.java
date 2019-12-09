package mvc_swing_jfx.view;


import java.util.Observable;
import java.util.Observer;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.stage.Stage;
import mvc_swing_jfx.controller.TemperatureController;
import mvc_swing_jfx.model.TemperatureModel;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;




public class TemperatureVueGUIFX extends Application implements TemperatureVue {
	
	protected TemperatureModel model;
	protected TemperatureController controller;
	protected TextField display;
	
	public TemperatureVueGUIFX(TemperatureModel tempmod, TemperatureController tempcontrolFX) {
		this.model = tempmod;
		this.controller = tempcontrolFX;	
		model.addObserver(this);
	}
	
	
	/**
	 * 
	 */
	public TemperatureVueGUIFX() {
		super();
	}


	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		super.init();
	}
    
    @Override
    public void start(Stage primaryStage) {
    	//Build the GUI
        primaryStage.setTitle("Thermostat - JavaFX");
        SplitPane root = new SplitPane(); //Window is split in two panels, one up, one down. 
        root.setPrefWidth(500);
        root.setPrefHeight(400);
        root.setOrientation(Orientation.VERTICAL);
        root.setDividerPosition(0, 0.86);
        AnchorPane paneUp = new AnchorPane();//Up and Down panel are AnchorPane
        AnchorPane paneDown = new AnchorPane();
        root.getItems().add(paneUp);
        root.getItems().add(paneDown);
 
        //PaneUp : Text field
        display = new TextField();
        display.setEditable(true); // we can set a new temperature via the text field
        display.setLayoutX(270);
        display.setLayoutY(158);
        setDisplay(""+model.getC()); // initial temperature value
        display.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
            public void handle(ActionEvent event) { // on textfield event (i.e. edit) : call controller
            	controller.fixeDegresC(getDisplay());;
            }
        });
        Label tempLabel = new Label("Température actuelle :");
        tempLabel.setLayoutX(104);
        tempLabel.setLayoutY(163);
        paneUp.getChildren().add(tempLabel);
        paneUp.getChildren().add(display);
        
        //PaneDown : Button Bar with two buttons
        ButtonBar butBar = new ButtonBar();
        paneDown.getChildren().add(butBar);
        butBar.setButtonMinWidth(40);
        AnchorPane.setTopAnchor(butBar, 0.0); //Button bar completely fills the anchorpane (i.e. margin are 0.0)
        AnchorPane.setBottomAnchor(butBar, 0.0);
        AnchorPane.setLeftAnchor(butBar, 0.0);
        AnchorPane.setRightAnchor(butBar, 0.0);
        
        
        Button btnPlus = new Button();
        Button btnMoins = new Button();
        btnPlus.setTranslateX(-10.0);
        btnMoins.setTranslateX(-10.0);
        btnPlus.setText("+");
        btnPlus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) { // on button event : call controller
            	controller.augmenteDegresC();
            }
        });
        btnMoins.setText("-");
        btnMoins.setOnAction(new EventHandler<ActionEvent>() { // on button event : call controller
            @Override
            public void handle(ActionEvent event) {
            	controller.diminueDegresC();
            }
        });
        butBar.getButtons().addAll(btnMoins, btnPlus);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    public void setDisplay(String s) {
		display.setText(s);
	}
    public double getDisplay() {
		double result = 0.0;
		try {
			result = Double.valueOf(display.getText()).doubleValue();
		}
		catch (NumberFormatException e){}
		return result;
	}
    
	public void enableWarning() {
		display.setStyle("-fx-background-color: red;");
	}

	public void disableWarning() {
		display.setStyle("-fx-background-color: white;");
	}
	public void update(Observable s, Object o) {
		setDisplay(""+model.getC());
	}
	
}
