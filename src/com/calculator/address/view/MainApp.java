package com.calculator.address.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainApp extends Application {
    
	@Override
	public void start(Stage primaryStage) {
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("CalcView.fxml"));
			Scene scene = new Scene(root,362.0,445.0);
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.getIcons().add(new Image("file:resources/images/calculator_icon_favicon.png"));
			
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
