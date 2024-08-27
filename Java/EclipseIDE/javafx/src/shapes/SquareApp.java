package shapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SquareApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a square with equal width and height
        Rectangle square = new Rectangle();
        square.setX(125.0);  // X-coordinate of the top-left corner
        square.setY(125.0);  // Y-coordinate of the top-left corner
        square.setWidth(100.0); // Width of the square
        square.setHeight(100.0); // Height of the square
        square.setFill(Color.YELLOW); // Fill color of the square

        // Create a Pane to hold the square
        Pane pane = new Pane();
        pane.getChildren().add(square);

        // Create a Scene with the pane, set its dimensions
        Scene scene = new Scene(pane, 350, 350);

        // Set the title of the stage (window)
        primaryStage.setTitle("Square in JavaFX");

        // Set the scene for the stage
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
