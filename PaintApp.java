/*
 * Author:                 Sujan Rokad, 000882948
 * Authorship statement:   I, Sujan Rokad, 000882948, certify that this material is my original work.
 *                         No other person's work has been used without due acknowledgment.
 * Purpose:                Define a JavaFX application for a simple paint program with color selection, shape selection,
 *                         size adjustment, drawing, and canvas clearing functionality.
 */

package Assignment_000882948;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * The PaintApp class represents a JavaFX application for a simple paint program with color selection, shape selection,
 * size adjustment, drawing, and canvas clearing functionality.
 *
 * @author Sujan Rokad
 */
public class PaintApp extends Application {
    // instance variables for the PaintApp class
    private Canvas canvas;
    private GraphicsContext gc;
    private ColorPicker colorPicker;
    private double size = 20;
    private String shape = "Circle";
    private Circle circle;
    private Square square;

    // main method that launches the application
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // create a canvas and get its graphics context
        canvas = new Canvas(1000, 600);
        gc = canvas.getGraphicsContext2D();

        // create a color picker control with the default color set to black
        colorPicker = new ColorPicker(Color.BLACK);

        // create buttons for selecting the shape to draw and set their event handlers
        Button circleButton = new Button("Circle");
        circleButton.setStyle("-fx-background-color: blue; -fx-text-fill: white;");
        circleButton.setOnAction(event -> {
            shape = "Circle";
        });

        Button squareButton = new Button("Square");
        squareButton.setStyle("-fx-background-color: grey; -fx-text-fill: white;");
        squareButton.setOnAction(event -> {
            shape = "Square";
        });

        // create a slider for adjusting the size of the shape to draw and set its event handler
        Slider sizeSlider = new Slider(5, 50, size);
        sizeSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            size = newValue.doubleValue();
        });

        // create a button for clearing the canvas and set its event handler
        Button clearButton = new Button("Clear");
        clearButton.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        clearButton.setOnAction(event -> {
            gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        });

        // set the event handler for the canvas to draw the selected shape at the clicked location
        canvas.setOnMouseClicked(e -> {
            gc.setFill(colorPicker.getValue());
            if (shape.equals("Circle")){
                circle = new Circle(e.getX(), e.getY(), size/2);
                circle.draw(gc);
            } else if (shape.equals("Square")) {
                square = new Square(e.getX(), e.getY(), size);
                square.draw(gc);
            }
        });

        // create an HBox to hold the buttons and slider
        HBox buttonBox = new HBox();
        buttonBox.setSpacing(10);
        buttonBox.setPadding(new Insets(10));
        buttonBox.getChildren().addAll(circleButton, squareButton, colorPicker, clearButton, sizeSlider);

        // create a border pane to hold the canvas and the button HBox
        BorderPane root = new BorderPane(canvas);
        root.setBottom(buttonBox);

        // create a scene and set it on the primary stage
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Paint App");
        primaryStage.show();
    }
}
