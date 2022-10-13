package shape;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;

public class Polygon extends AbstractShape{

    private Color color;

    @Override
    public void draw(GraphicsContext context) {

    }

    public Polygon (Color color, Point2D points){
        this.color = color;
    }
}
