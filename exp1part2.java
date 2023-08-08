import java.util.Scanner;
class SumDivisibleBy3 {
    public static int sumOfDivisibleBy3(int n) {
        int num_of_terms = (n / 3) + 1;
        int sum_of_terms = (num_of_terms * (3 + (num_of_terms - 1) * 3)) / 2;
        return sum_of_terms;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.print("Enter the number: ");
                int n = scanner.nextInt();
                if (n < 0) {
                    System.out.print("n should be a positive integer");
                }
                int result = sumOfDivisibleBy3(n);
                System.out.println("The sum of all numbers from 0 to " + n + " divisible by 3 is: " + result);
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a positive integer.");
            }
        }
    }
}

