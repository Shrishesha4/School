package shapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RectangleApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a rectangle with specified width and height
        Rectangle rectangle = new Rectangle();
        rectangle.setX(100.0);  // X-coordinate of the top-left corner
        rectangle.setY(100.0);  // Y-coordinate of the top-left corner
        rectangle.setWidth(200.0);  // Width of the rectangle
        rectangle.setHeight(100.0); // Height of the rectangle
        rectangle.setFill(Color.GREEN); // Fill color of the rectangle

        // Create a Pane to hold the rectangle
        Pane pane = new Pane();
        pane.getChildren().add(rectangle);

        // Create a Scene with the pane, set its dimensions
        Scene scene = new Scene(pane, 400, 300);

        // Set the title of the stage (window)
        primaryStage.setTitle("Rectangle in JavaFX");

        // Set the scene for the stage
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

