package shape;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends AbstractShape {
    private Color color;
    Rectangle(Color color, Point2D point0, Point2D point1){
        super();
        addPoints(point0, point1);
        this.color = color;
    }


    @Override
    public void draw(GraphicsContext context) {
        context.setFill(color);
        double x = point(0).getX();
        double y = point(0).getY();
        double x1 = point(1).getX();
        double y1 = point(1).getY();
        double h = y1-y;
        double w = x1-x;

        context.fillRect(x, y, h, w);
    }
}
