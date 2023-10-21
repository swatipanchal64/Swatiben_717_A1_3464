public class Triangle {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double findDistance(Point a, Point b) {
        return Math.sqrt( Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public Type findType() {

        double side1 = findDistance(this.a, this.b);
        double side2 = findDistance(this.b, this.c);
        double side3 = findDistance(this.c, this.a);

        if (side1 == side2 && side2 == side3) {
            return Type.Equilateral;
        }
        else if(side1 == side2 || side1 == side3 || side2 == side3) {
            return Type.Isosceles;
        }
        else {
            return Type.Unknown;
        }
    }

}
