package shape;

import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;
import java.util.List;

public class ShapeContainer{

    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public void  draw(GraphicsContext context){
        for(Shape shape : shapes)
            shape.draw(context);
    }
}
