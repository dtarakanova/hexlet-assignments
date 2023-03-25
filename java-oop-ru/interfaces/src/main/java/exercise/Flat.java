package exercise;

// BEGIN
public class Flat implements Home {
    double area;
    double balconyArea;
    int floor;

    public Flat (double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getArea () {
        double totalArea = area + balconyArea;
        return totalArea;
    }

    public int compareTo(Home Cottage) {
        if (getArea() == Cottage.getArea()) {
            return 0;
        } else if (getArea() > Cottage.getArea()) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        System.out.println("Квартира площадью " + getArea() + "метров на " + floor + "этаже");
    }
}
// END
