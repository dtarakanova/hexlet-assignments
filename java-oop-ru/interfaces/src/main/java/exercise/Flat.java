package exercise;

// BEGIN
public class Flat implements Home {
    double area;
    double balconyArea;
    int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getArea() {
        double totalArea = area + balconyArea;
        return totalArea;
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
        String message = "Квартира площадью " + getArea() + " метров на " + floor + " этаже";
        return message;
    }
}
// END
