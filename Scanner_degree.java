import java.lang.*;
import java.util.Scanner;
public class Scanner_degree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner ( System.in );
        String variable = scanner.nextLine();

        double radians = Math.toRadians(Double.parseDouble(variable));

        double sinResult = Math.sin(radians);
           System.out.println("Sin "+ variable + ": " + sinResult);
   
           double cosResult = Math.cos(radians);
           System.out.println("Cos "+ variable +": " + cosResult);   
    }
}