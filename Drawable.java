//Author: Sujan Rokad, 000882948

package Assignment_000882948;

import javafx.scene.canvas.GraphicsContext;

// This interface defines a contract for objects that can be drawn on a canvas using the JavaFX GraphicsContext.
public interface Drawable {
    // Method that must be implemented by classes that implement the Drawable interface
    // Draws the object on a canvas using the given GraphicsContext
    void draw(GraphicsContext gc);
}
