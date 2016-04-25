package applet;

/**
 * Created by Pavilion on 24-4-2016.
 */
import javafx.application.Application;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import static java.awt.Color.*;
import static javax.swing.text.StyleConstants.setBackground;

public class main extends Application {

    Button button;
    public static void main(String[]args){
        launch(args);

    }

    public void start(Stage primaryStage)throws Exception{
        primaryStage.setTitle("window");
        button=new Button();
        button.setText("click me");

        button.setOnAction(event -> System.out.println("I am inner class"));

        StackPane layout=new StackPane();
        layout.getChildren().add(button);
        Scene scene=new Scene(layout,300,250);
        primaryStage.setScene(scene);
        primaryStage.show();



    }




        }





