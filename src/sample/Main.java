package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;
import java.util.Collection;

public class Main extends Application {
    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        window.setTitle("The new boston");



        Button button1=new Button();
        button1.setText("Click me");
        button1.setOnAction(e -> AlertBox.display("Title","This is the alertBox"));


        StackPane layout1=new StackPane();
        layout1.getChildren().setAll( button1);
        window.setScene(new Scene(layout1, 300, 275));



        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
