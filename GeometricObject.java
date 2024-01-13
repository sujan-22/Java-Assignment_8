/*
 * Author:                 Sujan Rokad, 000882948
 * Authorship statement:   I, Sujan Rokad, 000882948, certify that this material is my original work.
 *                         No other person's work has been used without due acknowledgment.
 * Purpose:                Define a class representing a geometric object that can be drawn on a canvas
 *                         using the JavaFX GraphicsContext.
 */

package Assignment_000882948;

import javafx.scene.canvas.GraphicsContext;

/**
 * The GeometricObject class represents a geometric object that can be drawn on a canvas using the JavaFX GraphicsContext.
 *
 * @author Sujan Rokad
 */
public class GeometricObject implements Drawable {
    private double x; // x-coordinate of the object
    private double y; // y-coordinate of the object

    /**
     * Constructs a GeometricObject with the specified initial x and y coordinates.
     *
     * @param x The initial x-coordinate.
     * @param y The initial y-coordinate.
     */
    public GeometricObject(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x-coordinate of the object.
     *
     * @return The x-coordinate.
     */
    public double getX() {
        return x;
    }

    /**
     * Gets the y-coordinate of the object.
     *
     * @return The y-coordinate.
     */
    public double getY() {
        return y;
    }

    /**
     * Sets the x-coordinate of the object.
     *
     * @param x The new x-coordinate.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Sets the y-coordinate of the object.
     *
     * @param y The new y-coordinate.
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Draws the geometric object on a canvas using the given GraphicsContext.
     *
     * @param gc The GraphicsContext used for drawing.
     */
    @Override
    public void draw(GraphicsContext gc) {
        // This method will be implemented in a subclass of GeometricObject
        // that specifies how the object should be drawn
    }
}
