package lines;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class LinesApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create the first line
        Line line1 = new Line();
        line1.setStartX(50.0);  // Starting X-coordinate
        line1.setStartY(50.0);  // Starting Y-coordinate
        line1.setEndX(250.0);   // Ending X-coordinate
        line1.setEndY(50.0);    // Ending Y-coordinate
        line1.setStroke(Color.BLUE); // Line color

        // Create the second line
        Line line2 = new Line();
        line2.setStartX(50.0);  // Starting X-coordinate
        line2.setStartY(100.0); // Starting Y-coordinate
        line2.setEndX(250.0);   // Ending X-coordinate
        line2.setEndY(200.0);   // Ending Y-coordinate
        line2.setStroke(Color.RED);  // Line color

        // Create a Pane to hold the lines
        Pane pane = new Pane();
        pane.getChildren().addAll(line1, line2);

        // Create a Scene with the pane, set its dimensions
        Scene scene = new Scene(pane, 300, 250);

        // Set the title of the stage (window)
        primaryStage.setTitle("Lines in JavaFX");

        // Set the scene for the stage
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
