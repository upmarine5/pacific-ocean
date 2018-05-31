package DecoratorP;

public class RedShapeDecorator extends ShapeDecorator{


    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw(){
        decoratedShape.draw();
        setRedColor(decoratedShape);
    }
    private void setRedColor(Shape decoratedShape){
        System.out.println("color:red");
    }
}
