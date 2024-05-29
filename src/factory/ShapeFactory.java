public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.trim().equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.trim().equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
