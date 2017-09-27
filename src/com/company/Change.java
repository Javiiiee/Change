package com.company;
import java.util.Optional;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Screen;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.TextInputDialog;

public class Change extends Application {
    @Override
    public void start (Stage primaryStage){
	// Constant and Variable set up
        final int QUARTER = 25;
        final int DIME = 10;
        final int NICKEL = 5;
        final int PENNIES = 1;

        //JavaFX input set up, and specific input for $10
        TextInputDialog textInputDialog = new TextInputDialog("145.6");
        textInputDialog.setTitle("");
        textInputDialog.setHeaderText("Bills to Coins Converter");
        textInputDialog.setContentText("Enter quantity of 10's");
        Optional<String> tens = textInputDialog.showAndWait();

        //Creating a second input for 1$
        TextInputDialog cinco = new TextInputDialog("145.6");
        cinco.setHeaderText("bills to Coins Converter");
        cinco.setContentText("Enter quantity of 5'S");
        Optional<String> fives = cinco.showAndWait();

        //Creating a third input for $1
        TextInputDialog unos = new TextInputDialog("145.6");
        unos.setHeaderText("Bills to Coins Converter");
        unos.setContentText("Enter quantity of 1's");
        Optional<String> ones = unos.showAndWait();

        //Math
        //1) convert the inputs into readable numbers
        int tensquantity = Integer.parseInt(tens.get());
        int fivesquantity = Integer.parseInt(fives.get());
        int onesquantity = Integer.parseInt(ones.get());

        // convert numbers to cents
        int tenscents = (tensquantity*1000);
        int fivecents = (fivesquantity*500);
        int onescents = (onesquantity*100);
        int totalcents = (tenscents+fivecents+onescents);

        int totalquarters = (totalcents/QUARTER);
        int totaldimes = (totalcents/DIME);
        int totalnickles = (totalcents/NICKEL);


        //JavaFX output set up
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("results");
        alert.setHeaderText("Total Cents " + totalcents );
        alert.setContentText("Quarters:" +totalquarters+"\n"+ "Dimes:" +totaldimes+"\n"+"Nickles:"+ totalnickles);
        alert.show();




    }

}
