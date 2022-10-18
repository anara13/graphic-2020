package shape;

import javafx.scene.canvas.GraphicsContext;

public class CenterDecorator extends Decorator{

    private double radius;

    public CenterDecorator(Shape decoratedShape, double radius) {
        super(decoratedShape);
        this.radius = radius;
    }

    @Override
    public void drawDecorator(GraphicsContext graphicsContext) {

    }

}
