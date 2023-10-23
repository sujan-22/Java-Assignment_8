//Author: Sujan Rokad, 000882948

package Assignment_000882948;

import javafx.scene.canvas.GraphicsContext;

// This class represents a geometric object that can be drawn on a canvas using the JavaFX GraphicsContext.
public class GeometricObject implements Drawable{
    private double x; // x-coordinate of the object
    private double y; // y-coordinate of the object

    // Constructor that sets the initial x and y coordinates of the object
    public GeometricObject(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter for the x-coordinate
    public double getX() {
        return x;
    }

    // Getter for the y-coordinate
    public double getY() {
        return y;
    }

    // Setter for the x-coordinate
    public void setX(double x) {
        this.x = x;
    }

    // Setter for the y-coordinate
    public void setY(double y) {
        this.y = y;
    }

    // Method that must be implemented as part of the Drawable interface
    // Draws the geometric object on a canvas using the given GraphicsContext
    @Override
    public void draw(GraphicsContext gc) {
        // This method will be implemented in a subclass of GeometricObject
        // that specifies how the object should be drawn
    }
}
