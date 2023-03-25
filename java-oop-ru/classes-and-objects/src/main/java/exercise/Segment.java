package exercise;

// BEGIN
public class Segment {
    private Point point1;
    private Point point2;

    public Segment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getBeginPoint() {
        return point1;
    }

    public Point getEndPoint() {
        return point2;
    }

    public Point getMidPoint() {
        Point midPointX = (x.point1 + x.point2) / 2;
        Point midPointY = (y.point1 + y.point2) / 2;
        var midPoint = new Point(midPointX, midPointY);
        return midPoint;
    }
}
// END
