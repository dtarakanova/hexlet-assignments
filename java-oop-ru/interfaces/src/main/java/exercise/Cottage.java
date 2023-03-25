package exercise;

// BEGIN
public class Cottage implements Home {
    double area;
    int floorCount;

    public Cottage (double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public double getArea () {
        return area;
    }

    public int compareTo(Home Flat) {
        if (getArea() == Flat.getArea()) {
            return 0;
        } else if (getArea() > Flat.getArea()) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        System.out.println(floorCount + " этажный коттедж площадью " + getArea() + "метров");
    }
}
// END
