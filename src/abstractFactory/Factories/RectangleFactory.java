package Factories;

import Shapes.Shape;
import Shapes.Rectangle;

public class RectangleFactory extends ShapeAbstractFactory {

    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
