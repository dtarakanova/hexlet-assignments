package exercise;

// BEGIN
public class Cottage implements Home {
    double area;
    int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public double getArea() {
        return area;
    }

    public int compareTo(Home another) {
        if (getArea() == another.getArea()) {
            return 0;
        } else if (getArea() > another.getArea()) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        String message = floorCount + " этажный коттедж площадью " + getArea() + " метров";
        return message;
    }
}
// END
