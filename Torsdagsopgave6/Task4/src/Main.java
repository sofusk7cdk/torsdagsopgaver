public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Square square = new Square(5,5);

        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(circle);
        shapeBuilder.addShape(square);

        System.out.println("Total area: " + shapeBuilder.getTotalArea());
    }
}