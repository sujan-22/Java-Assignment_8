/*
 * Author:                 Sujan Rokad, 000882948
 * Authorship statement:   I, Sujan Rokad, 000882948, certify that this material is my original work.
 *                         No other person's work has been used without due acknowledgment.
 * Purpose:                Define a class representing a square that can be drawn on a canvas using JavaFX GraphicsContext.
 */

package Assignment_000882948;

import javafx.scene.canvas.GraphicsContext;

/**
 * The Square class represents a square that can be drawn on a canvas using the JavaFX GraphicsContext.
 *
 * @author Sujan Rokad
 */
public class Square extends GeometricObject {
    private double size; // size of the square

    /**
     * Constructor that sets the initial x and y coordinates of the square and its size.
     *
     * @param x    The initial x-coordinate of the square.
     * @param y    The initial y-coordinate of the square.
     * @param size The size of the square.
     */
    public Square(double x, double y, double size) {
        super(x, y); // Call the constructor of the superclass (GeometricObject) to set x and y coordinates
        this.size = size; // Set the size of the square
    }

    /**
     * Method that must be implemented as part of the Drawable interface.
     * Draws the square on a canvas using the given GraphicsContext.
     *
     * @param gc The GraphicsContext used for drawing on the canvas.
     */
    @Override
    public void draw(GraphicsContext gc) {
        // The x and y coordinates are adjusted to position the center of the square at (x, y)
        gc.fillRect(getX() - size, getY() - size, size, size);
    }
}
