package shapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class TriangleApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a triangle using a Polygon
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(
            150.0, 50.0,  // Vertex 1 (x, y)
            100.0, 150.0, // Vertex 2 (x, y)
            200.0, 150.0  // Vertex 3 (x, y)
        );
        triangle.setFill(Color.RED); // Fill color of the triangle

        // Create a Pane to hold the triangle
        Pane pane = new Pane();
        pane.getChildren().add(triangle);

        // Create a Scene with the pane, set its dimensions
        Scene scene = new Scene(pane, 300, 200);

        // Set the title of the stage (window)
        primaryStage.setTitle("Triangle in JavaFX");

        // Set the scene for the stage
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
