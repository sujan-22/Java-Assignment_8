/*
 * Author:                 Sujan Rokad, 000882948
 * Authorship statement:   I, Sujan Rokad, 000882948, certify that this material is my original work.
 *                         No other person's work has been used without due acknowledgment.
 * Purpose:                Define an interface for objects that can be drawn on a canvas using the JavaFX GraphicsContext.
 */

package Assignment_000882948;

import javafx.scene.canvas.GraphicsContext;

/**
 * The Drawable interface defines a contract for objects that can be drawn on a canvas using the JavaFX GraphicsContext.
 *
 * @author Sujan Rokad
 */
public interface Drawable {
    /**
     * Draws the object on a canvas using the given GraphicsContext.
     *
     * @param gc The GraphicsContext used for drawing.
     */
    void draw(GraphicsContext gc);
}
