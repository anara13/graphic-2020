package shape;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

public interface Shape {
    int pointsCount();
    Point2D point(int index);
    void draw(GraphicsContext context);
}
