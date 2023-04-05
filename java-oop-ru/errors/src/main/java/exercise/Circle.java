package exercise;

// BEGIN
public class Circle {
    private int pointX;
    private int pointY;
    private int radius;

    public Circle(int pointX, int pointY, int radius) {
        this.pointX = pointX;
        this.pointY = pointY;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException("Radius must be > 0");
        } else {
            return Math.PI * getRadius() * getRadius();
        }
    }
}
// END
