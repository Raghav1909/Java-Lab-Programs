class Shape {
    double area;

    void area(double r) {
        area = Math.PI * r * r;
        System.out.println("Area of circle is " + area);
    }

    void area(double l, double b) {
        area = l * b;
        System.out.println("Area of rectangle is " + area);
    }

    void area(double a, double b, double c) {
        double s;
        s = (a + b + c) / 2;

        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle is " + area);
    }
}

public class Program2 {
    public static void main(String[] args) {
        Shape circle = new Shape();
        Shape rectangle = new Shape();
        Shape triangle = new Shape();

        circle.area(3);
        rectangle.area(3, 2);
        triangle.area(3, 3, 3);
    }
}
