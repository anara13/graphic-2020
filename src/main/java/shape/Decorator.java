package shape;

public abstract class Decorator {
     abstract Shape decoratedShape;

     public Decorator(Shape decoratedShape){
         this.decoratedShape = decoratedShape;
     }
}
