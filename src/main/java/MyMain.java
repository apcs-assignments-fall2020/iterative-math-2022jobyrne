//Jen O'Byrne Iterative Math Methods Homework
import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
    double n = 100;
    double othern = 0;  
    while (Math.abs(n - othern) > 0.000001) {
    double m = (n + x/n) / 2;
    othern = n;
    n = m;
}
    return n;
}

    // Calculates the factorial of a number
    public static double factorial(double number) {
        double n = 1;
        while ((number != 1) && (number != 0)) {
            n = n * number;
            number = number - 1;
        }
        if (number != 0) {
            return n;
        }
        else {
            return 1;
        }
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        int number = 0;
        int counter = 0;
        double n = 0;
        double n2 = 1;
        do {
            n2 = 1 / factorial(number);
            n = n2 + n;
            number = number + 1;
            counter = counter + 1;
        } while ((n > 0.00000001) && (counter <= 15
        ));
        return n;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a decimal number to find the square root of");
        Double input = scan.nextDouble();
        System.out.println("Please enter another number to find the factorial of");
        Double secondinput = scan.nextDouble();
        System.out.println(input + " square rooted is " + babylonian(input));
        System.out.println(secondinput + "'s factorial is " + factorial(secondinput));
        System.out.println("the value of e is " + calculateE());
        scan.close();
    }
}
