package shape;

import javafx.scene.canvas.GraphicsContext;

public class BorderDecorator extends Decorator{
    private double radius;

    public BorderDecorator(Shape decoratedShape, double radius) {
        super(decoratedShape);
        this.radius = radius;
    }

    @Override
    public void drawDecorator(GraphicsContext graphicsContext) {

    }
}
