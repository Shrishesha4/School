package shapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a circle with a radius of 50 pixels
        Circle circle = new Circle();
        circle.setCenterX(150.0); // X-coordinate of the circle center
        circle.setCenterY(150.0); // Y-coordinate of the circle center
        circle.setRadius(50.0);   // Radius of the circle
        circle.setFill(Color.BLUE); // Fill color of the circle

        // Create a Pane to hold the circle
        Pane pane = new Pane();
        pane.getChildren().add(circle);

        // Create a Scene with the pane, set its dimensions
        Scene scene = new Scene(pane, 300, 300);

        // Set the title of the stage (window)
        primaryStage.setTitle("Circle in JavaFX");

        // Set the scene for the stage
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
