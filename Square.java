//Author: Sujan Rokad, 000882948

package Assignment_000882948;

import javafx.scene.canvas.GraphicsContext;

// This class represents a square that can be drawn on a canvas using the JavaFX GraphicsContext.
public class Square extends GeometricObject {
    private double size; // size of the square

    // Constructor that sets the initial x and y coordinates of the square and its size
    public Square(double x, double y, double size) {
        super(x, y); // Call the constructor of the superclass (GeometricObject) to set x and y coordinates
        this.size = size; // Set the size of the square
    }

    // Method that must be implemented as part of the Drawable interface
    // Draws the square on a canvas using the given GraphicsContext
    @Override
    public void draw(GraphicsContext gc) {
        // The x and y coordinates are adjusted to position the center of the square at (x, y)
        gc.fillRect(getX() - size, getY() - size, size, size);
    }
}
