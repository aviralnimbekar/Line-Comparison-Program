import java.util.Scanner;

public class LineComparisonProgram {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
            //generating variable for coordinates of first line
        int x1,y1,x2,y2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter coordinate of line-1\n" +
                "Enter x1 point");
        x1 = input.nextInt();
        System.out.println("Enter y1 point");
        y1 = input.nextInt();
        System.out.println("Enter x2 point");
        x2 = input.nextInt();
        System.out.println("Enter y2 point");
        y2 = input.nextInt();

        double length1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));                              //computing length of line 1

            //generating variable for coordinates of second line
        int p1,q1,p2,q2;

        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter coordinate of line-2\n" +
                "Enter p1 point");
        p1 = input2.nextInt();
        System.out.println("Enter q1 point");
        q1 = input2.nextInt();
        System.out.println("Enter p2 point");
        p2 = input2.nextInt();
        System.out.println("Enter q2 point");
        q2 = input2.nextInt();

        double length2 = Math.sqrt((p2-p1)*(p2-p1) + (q2-q1)*(q2-q1));                              //computing length of line 2
        System.out.println("Length of line-1 " + "("+x1+","+y1+"),("+x2+","+y2+") = " +length1);    //printing line 1
        System.out.println("Length of line-2 " + "("+p1+","+q1+"),("+p2+","+q2+") = " +length2);    //printing line 2

        if (length1 == length2) {
            System.out.println("Line-1 and Line-2 are equal");
        }
        else if (length1 < length2) {
            System.out.println("Line-1 is less than Line-2");
        }
        else if (length1 > length2) {
            System.out.println("Line-1 is greater than Line-2");
        }
    }
}
