package Factories;

import Shapes.Shape;
import Shapes.Circle;

public class CircleFactory extends ShapeAbstractFactory {
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
