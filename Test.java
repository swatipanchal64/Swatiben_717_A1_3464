import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Triangle[] t = new Triangle[3];

        for(int i = 0; i < 1; i++) {

            System.out.printf("-------------Triangle %d------------- \n", (i+1));

            Point[] p = new Point[3];

            for(int j = 0; j < 3; j++) {
                System.out.printf("-------------Point %d------------- \n", (j+1));

                System.out.print("Enter the x co-ordinate of x: ");
                double x = in.nextDouble();

                System.out.print("Enter the y co-ordinate of y: ");
                double y = in.nextDouble();

                p[j] = new Point(x,y);
            }

             t[i] = new Triangle(p[0], p[1], p[2]);
        }

//        System.out.print("Enter the x co-ordinate of point to be checked: ");
//        double pointX = in.nextDouble();
//
//        System.out.print("Enter the y co-ordinate of point to be checked: ");
//        double pointY = in.nextDouble();
//
        int i = 1;
        for (Triangle triangle : t) {

            System.out.println(triangle.findType());


//            boolean isInside = circle.isInternal(pointX, pointY);
//
//            if (isInside) {
//                System.out.printf("The point is inside the circle %d\n", i++);
//            }
//            else {
//                System.out.printf("The point is outside the circle %d\n", i++);
//            }
        }

    }
}
