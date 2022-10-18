package shape;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;

public class Polygon extends AbstractShape{

    private Color color;

    @Override
    public void draw(GraphicsContext context) {
        context.setFill(color);
        int countPoints = pointsCount();
        double[] xPoints = new double[countPoints];
        double[] yPoints = new double[countPoints];
        for (int i = 0; i<countPoints; i++){
            xPoints[i] = point(i).getX();
            yPoints[i] = point(i).getY();

        }

        context.fillPolygon(xPoints, yPoints, countPoints);
    }

    public Polygon (Color color, Point2D... points){
        this.color = color;
        addPoints(points);
    }
}
