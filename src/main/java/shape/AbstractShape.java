package shape;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;
import java.util.List;

public abstract class  AbstractShape implements Shape{
    List<Point2D> points = new ArrayList<>();

    public int addPoints(Point2D points){ return 0; }

    @Override
    public int pointsCount(){
        return 0;
    }

    @Override
    public Point2D point(int index){
        return null;
    }

    @Override
    public abstract void draw(GraphicsContext context);

}
