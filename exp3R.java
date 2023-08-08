import java.util.Scanner;

public class exp3R {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static int lcm(int a, int b){
        return (a*b)/gcd(a, b);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Vijit, 16010221018      ");

            System.out.println("Enter Number 1:");
            int a = scanner.nextInt();

            System.out.println("Enter Number 2:");
            int b = scanner.nextInt();

            int gcdResult = gcd(a, b);
            int lcmResult = lcm(a,b);
            System.out.println("GCD of " + a + " and " + b + " is: " + gcdResult);
            System.out.println("LCM of " + a + " and " + b + " is: " + lcmResult);
        }
    }
}







