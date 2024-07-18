package java_methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        findLargestAndSmallestNumbers();
    }

    public static void findLargestAndSmallestNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int number2 = scanner.nextInt();

        System.out.println("Enter third number:");
        int number3 = scanner.nextInt();

        int largest = number1;
        int smallest = number1;

        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
        System.out.println(largest + " is your largest and " + smallest + " is your smallest number.");
    }
}