package apps;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SimpleCalculatorApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create input fields
        TextField num1Field = new TextField();
        TextField num2Field = new TextField();

        // Create a label to display results
        Label resultLabel = new Label();

        // Create buttons for operations
        Button addButton = new Button("+");
        Button subtractButton = new Button("-");
        Button multiplyButton = new Button("*");
        Button divideButton = new Button("/");

        // Add button event handlers
        addButton.setOnAction(e -> calculateResult(num1Field, num2Field, resultLabel, '+'));
        subtractButton.setOnAction(e -> calculateResult(num1Field, num2Field, resultLabel, '-'));
        multiplyButton.setOnAction(e -> calculateResult(num1Field, num2Field, resultLabel, '*'));
        divideButton.setOnAction(e -> calculateResult(num1Field, num2Field, resultLabel, '/'));

        // Create a grid pane for layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);

        // Add components to the grid
        grid.add(new Label("Number 1:"), 0, 0);
        grid.add(num1Field, 1, 0);
        grid.add(new Label("Number 2:"), 0, 1);
        grid.add(num2Field, 1, 1);
        grid.add(addButton, 0, 2);
        grid.add(subtractButton, 1, 2);
        grid.add(multiplyButton, 0, 3);
        grid.add(divideButton, 1, 3);
        grid.add(resultLabel, 0, 4, 2, 1);

        // Create a scene and set it on the stage
        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setTitle("Simple Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void calculateResult(TextField num1Field, TextField num2Field, Label resultLabel, char operator) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        resultLabel.setTextFill(Color.RED);
                        resultLabel.setText("Error: Divide by zero");
                        return;
                    }
                    break;
            }
            resultLabel.setTextFill(Color.BLACK);
            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException e) {
            resultLabel.setTextFill(Color.RED);
            resultLabel.setText("Error: Invalid input");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
