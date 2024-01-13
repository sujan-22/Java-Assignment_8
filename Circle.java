/*
 * Author:                 Sujan Rokad, 000882948
 * Authorship statement:   I, Sujan Rokad, 000882948, certify that this material is my original work.
 *                         No other person's work has been used without due acknowledgment.
 * Purpose:                Define a class representing a circle that can be drawn on a canvas.
 */

package Assignment_000882948;

import javafx.scene.canvas.GraphicsContext;

/**
 * The Circle class represents a circle that can be drawn on a canvas using the JavaFX GraphicsContext.
 *
 * @author Sujan Rokad
 */
public class Circle extends GeometricObject {
    private double radius; // radius of the circle

    /**
     * Constructs a Circle object with the specified initial x and y coordinates and radius.
     *
     * @param x      The initial x-coordinate.
     * @param y      The initial y-coordinate.
     * @param radius The radius of the circle.
     */
    public Circle(double x, double y, double radius) {
        super(x, y); // Call the constructor of the superclass (GeometricObject) to set x and y coordinates
        this.radius = radius; // Set the radius of the circle
    }

    /**
     * Draws the circle on a canvas using the given GraphicsContext.
     *
     * @param gc The GraphicsContext used for drawing.
     */
    @Override
    public void draw(GraphicsContext gc) {
        // The x and y coordinates are adjusted to position the center of the circle at (x, y)
        gc.fillOval(getX() - radius, getY() - radius, 3 * radius, 3 * radius);
    }
}
