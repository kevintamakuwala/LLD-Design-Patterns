package Factories;

import Shapes.Shape;

public class ShapeFactory {
    public static Shape getFactory(ShapeAbstractFactory factory) {
        return factory.getShape();
    }
}
