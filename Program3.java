import javax.lang.model.util.ElementScanner14;

class Point {
    int x, y;

    Point() {
        x = 0;
        y = 0;
        System.out.println("Point created at (" + x + "," + y + ")");
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Point created at (" + x + "," + y + ")");
        quadrant();
    }

    void quadrant() {
        if (x > 0 && y > 0)
            System.out.println("Point lies in first quadrant");
        else if (x < 0 && y > 0)
            System.out.println("Point lies in second quadrant");
        else if (x < 0 && y < 0)
            System.out.println("Point lies in third quadrant");
        else
            System.out.println("Point lies in fourth quadrant");
    }

    void checkTriangle(Point a, Point b, Point c) {
        if ((a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) == 0)
            System.out.println("Does not form triangle");

        else
            System.out.println("Forms triangle");
    }

    void distance(Point a, Point b) {
        double dist;
        dist = Math.sqrt((b.x - a.x) * (b.x - a.x) - (b.y - a.y) * (b.y - a.y));
        System.out
                .println("Distance between points (" + a.x + "," + a.y + ") and (" + b.x + "," + b.y + ") is " + dist);
    }

}

public class Program3 {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3, 2);
        Point p3 = new Point(-4, -5);
        Point res = new Point();
        res.checkTriangle(p1, p2, p3);
        res.distance(p1, p2);
    }
}
