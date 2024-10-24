public class Square implements Shape{

    double lengthX, lengthY;
    
    public Square(double lengthX, double lengthY) {
        this.lengthX = lengthX;
        this.lengthY = lengthY;
    }

    @Override
    public double getArea() {
        return lengthX * lengthY;
    }
}
