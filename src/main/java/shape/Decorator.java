package shape;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

public abstract class Decorator implements Shape{
    Shape decoratedShape;
    public Decorator(Shape decoratedShape){
         this.decoratedShape = decoratedShape;
     }

    @Override
    public int pointsCount(){
        return 0;
    }

    @Override
    public Point2D point(int index){
        return null;
    }

    @Override
    public void draw(GraphicsContext context) {

    }

    public abstract void drawDecorator(GraphicsContext graphicsContext);
}
