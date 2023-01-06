import java.util.Scanner;
public class Exercise44 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter radius !");
        Double r = input.nextDouble();

        double area = r * 3.14;
        System.out.println( "area = " + r + " * " + r +  " * " + 3.14 );
        System.out.println( "answer = " + r * r * 3.14 );
    }
}
