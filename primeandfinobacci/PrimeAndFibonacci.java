public class PrimeAndFibonacci {

    // Constructor
    public PrimeAndFibonacci() {
        // Constructor body
    }

    // Non-static method to check if a number is prime
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int digit = 2; digit <= Math.sqrt(num); digit++) {
            if (num % digit == 0) {
                return false;
            }
        }
        return true;
    }

    // Static method to display prime numbers between 1 and 500
    public static void displayPrimeNumbers() {
        PrimeAndFibonacci instance = new PrimeAndFibonacci();
        System.out.println("Prime numbers between 1 and 500:");
        for (int digit = 1; digit <= 500; digit++) {
            if (instance.isPrime(digit)) {
                System.out.print(digit + " ");
            }
        }
        System.out.println();
    }

    // Static method to find the sum of all even-valued terms in the Fibonacci sequence that do not exceed four million
    public static int sumEvenFibonacci() {
        int sum = 0;
        int firstnum = 1;
        int secondnum = 2;
        while (secondnum <= 4000000) {
            if (secondnum % 2 == 0) {
                sum += secondnum;
            }
            int temp = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = temp;
        }
        return sum;
    }

    // Main method
    public static void main(String[] args) {
        // Display prime numbers between 1 and 500
        displayPrimeNumbers();

        // Calculate and display the sum of all even-valued terms in the Fibonacci sequence that do not exceed four million
        int sum = sumEvenFibonacci();
        System.out.println("Sum of all even-valued terms in the Fibonacci sequence that do not exceed four million: " + sum);
    }
}
