package exercise;

// BEGIN
public class Circle {
    protected int pointX;
    protected int pointY;
    protected int radius;

    public Circle(int pointX, int pointY, int radius) {
        this.pointX = pointX;
        this.pointY = pointY;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public static int getSquare(Circle circle) {
        if (getRadius() < 0) {
            throw new NegativeRadiusException();
        } else {
                double square = Math.PI * getRadius() * getRadius();
                int finsquare = (int)square;
                return finsquare;
        }
    }
}
// END
