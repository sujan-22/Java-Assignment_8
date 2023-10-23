//Author: Sujan Rokad, 000882948

package Assignment_000882948;

import javafx.scene.canvas.GraphicsContext;

// This class represents a circle that can be drawn on a canvas using the JavaFX GraphicsContext.
public class Circle extends GeometricObject{
    private double radius; // radius of the circle

    // Constructor that sets the initial x and y coordinates of the circle and its radius
    public Circle(double x, double y, double radius) {
        super(x, y); // Call the constructor of the superclass (GeometricObject) to set x and y coordinates
        this.radius = radius; // Set the radius of the circle
    }

    // Method that must be implemented as part of the Drawable interface
    // Draws the circle on a canvas using the given GraphicsContext
    @Override
    public void draw(GraphicsContext gc){
        // The x and y coordinates are adjusted to position the center of the circle at (x, y)
        gc.fillOval(getX() - radius, getY() - radius, 3*radius, 3*radius);
    }
}
