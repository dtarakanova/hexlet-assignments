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


    Segment segment = new Segment(point1, point2);
    Point midPoint = segment.getMidPoint();
  midPoint.getX(); // 5
  midPoint.getY();

    public Point getMidPoint() {
        Point midPointX = (point1.getX() + point2.getX()) / 2;
        Point midPointY = (point1.getY() + point2.getY()) / 2;
        Point midPoint = new Point(midPointX, midPointY);
        return midPoint;
    }
}
// END
