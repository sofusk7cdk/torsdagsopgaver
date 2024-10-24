import java.util.ArrayList;

public class ShapeBuilder {

    ArrayList<Shape> shapes;

    public ShapeBuilder() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public double getTotalArea() {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}
