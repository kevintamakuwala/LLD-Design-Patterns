import Shapes.Shape;

public class FactoryRunner {
    public static void main(String[] args) {
        System.out.println("=====Factory Pattern=====");

        Shape shape1 = ShapeFactory.getShape("CIRCLE");
        Shape shape2 = ShapeFactory.getShape("RECTANGLE");
        if (shape1 != null) {
            shape1.draw();
        }
        if (shape2 != null) {
            shape2.draw();
        }
    }
}
