package sample;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;
import java.util.Collection;

public class Main extends Application {
    Stage window;
    Button button1;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;
        window.setTitle("Hello World");
        window.setOnCloseRequest(e ->closeProgram());
        button1 = new Button("Close Program");
        button1.setOnAction(e -> closeProgram());


        StackPane layout1 = new StackPane();
        layout1.getChildren().add(button1);
        Scene scene = new Scene (layout1,300,250);


        window.setScene(scene);
        window.show();

    }

    private void closeProgram(){
        Boolean answer=ConfirmBox.display("Title","Are you sure you want to exit");
        if(answer){
            window.close();
        }
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}
