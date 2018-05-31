package DecoratorP;

public class Test {
    public static void main(String[] args) {
        Shape circle =new Circle();
        circle.draw();

        Shape redCircle=new RedShapeDecorator(new Circle());
        Shape redRectangle=new RedShapeDecorator(new Rectangle());
        redCircle.draw();
        redRectangle.draw();
    }
}
