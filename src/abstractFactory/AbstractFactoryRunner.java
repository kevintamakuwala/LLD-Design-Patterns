import Factories.ShapeFactory;
import Factories.CircleFactory;
import Factories.RectangleFactory;
import Shapes.Shape;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        System.out.println("=====Abstract Factory Pattern=====");
        Shape rectangle = ShapeFactory.getFactory(new RectangleFactory());
        Shape circle = ShapeFactory.getFactory(new CircleFactory());
        rectangle.draw();
        circle.draw();
    }
}
