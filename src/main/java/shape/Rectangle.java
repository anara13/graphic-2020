package shape;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends AbstractShape {
    private Color color;
    Rectangle(Color color, Point2D point0, Point2D point1){
        this.color = color;
    }

    @Override
    public int pointsCount() {
        return 0;
    }

    @Override
    public Point2D point(int index) {
        return null;
    }

    @Override
    public void draw(GraphicsContext context) {

    }
}
