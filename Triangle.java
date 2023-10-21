public class Triangle {
    private Point a, b, c;
    private double side1, side2, side3;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.side1 = findDistance(this.a, this.b);
        this.side2 = findDistance(this.b, this.c);
        this.side3 = findDistance(this.c, this.a);
    }

    public double findDistance(Point a, Point b) {
        return Math.sqrt( Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public Type findType() {

        if (this.side1 == this.side2 && this.side2 == this.side3) {
            return Type.Equilateral;
        }
        else if(this.side1 == this.side2 || this.side1 == this.side3 || this.side2 == this.side3) {
            return Type.Isosceles;
        }
        else {
            return Type.Unknown;
        }
    }

    public double findPerimeter() {
        return  this.side1 + this.side2 + this.side3;
    }

    public double area(double x1, double y1, double x2, double y2, double x3, double y3)
    {
        return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
    }

    public boolean isInside(Point p)
    {
        /* Calculate area of triangle ABC */
        double A = area (this.a.getX(), this.a.getY(), this.b.getX(), this.b.getY(), this.c.getX(), this.c.getY());

        /* Calculate area of triangle PBC */
        double A1 = area (p.getX(), p.getY(), this.b.getX(), this.b.getY(), this.c.getX(), this.c.getY());

        /* Calculate area of triangle PAC */
        double A2 = area (this.a.getX(), this.a.getY(), p.getX(), p.getY(), this.c.getX(), this.c.getY());

        /* Calculate area of triangle PAB */
        double A3 = area (this.a.getX(), this.a.getY(), this.b.getX(), this.b.getY(), p.getX(), p.getY());

        /* Check if sum of A1, A2 and A3 is same as A */
        return (A == A1 + A2 + A3);
    }

}
