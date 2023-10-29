import java.util.Scanner;

public class AverageOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        // Calculate the sum of first n natural numbers
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Calculate the average
        double average = (double) sum / n;

        System.out.println("The average of the first " + n + " natural numbers is: " + average);

        input.close();
}}