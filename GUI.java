package clarifai;
/*
import javafx.*;
import javafx.stage.Stage;

import java.io.File;
import java.util.List;
import java.awt.*;

import com.clarifai.api.ClarifaiClient;
import com.clarifai.api.RecognitionRequest;
import com.clarifai.api.RecognitionResult;
import com.clarifai.api.Tag;

public class GUI {
public void start(Stage primaryStage){
	primaryStage.setTitle("Insert title later");
	BorderPane componentLayout = new BorderPane();
}

}
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
 
public class GUI extends Application {
    
    @Override
    public void start(Stage primaryStage) {
     
        // Create Image and ImageView objects
        Image image = new Image("http://www.clarifai.com/img/metro-north.jpg");
        ImageView imageView = new ImageView();
        imageView.setImage(image);
       
        StackPane root = new StackPane();
        root.getChildren().add(imageView);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Image Write Test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }

}
