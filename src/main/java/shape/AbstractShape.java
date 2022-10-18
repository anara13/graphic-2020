package shape;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class  AbstractShape implements Shape{
    private List<Point2D> points = new ArrayList<>();

    public void addPoints(Point2D... points){
        this.points.addAll(Arrays.asList(points));
    }

    @Override
    public int pointsCount(){
        return this.points.size();
    }

    @Override
    public Point2D point(int index){
        return this.points.get(index);
    }

    @Override
    public abstract void draw(GraphicsContext context);

}
