public class ShapeTest {

    private Shape shape = new Shape();

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void printShape() {
        shape.printName();
    }

    public static void main(String[] args) {
        ShapeTest circle = new ShapeTest();
        circle.setShape(new Circle());
        circle.printShape();

        ShapeTest rectangle = new ShapeTest();
        rectangle.setShape(new Rectangle());
        rectangle.printShape();

    }
}
