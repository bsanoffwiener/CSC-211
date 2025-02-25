public class Shape {
    private int sides;

    public Shape() {
        sides = 0;
    }

    public Shape(int s) {
        sides = s;
    }

    public void setSides(int s) {
        sides = s;
    }

    public int getSides() {
        return sides;
    }
}

class Circle extends Shape {
    private int radius;

    public Circle() {
        super();
        radius = 0;
    }

    public Circle(int s, int r) {
        super(s);
        radius = r;
    }

    public void setRadius(int r) {
        radius = r;
    }

    public int getRadius() {
        return radius;
    }
}

class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle() {
        super();
        length = 0;
        width = 0;
    }

    public Rectangle(int s, int l, int w) {
        super(s);
        length = l;
        width = w;
    }

    public void setLength(int l) {
        length = l;
    }

    public void setWidth(int w) {
        width = w;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
class Main {
    public static void main(String[] args ) {
        Circle c1 = new Circle(1, 3);
        System.out.println(c1.getSides());
    }
}