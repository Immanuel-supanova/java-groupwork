/* This program takes 15 inputs from users as integers to form an array and perform tasks with the data */
import java.util.Scanner;
import java.util.Arrays;

public class UsersArrays{

    public void getUserInput(int[] userints, int sizeOfArray, Scanner scanner){
        int userinput, index;
        index = 0;

        // This propmpts the user to enter an integer 15 times
        do {
            index++;

			System.out.println("Number " + index + ":");
			userinput = scanner.nextInt();

            userints[index - 1] = userinput;

		} while(index <= sizeOfArray - 1); 

    }

    public void searchInArray(int[] userints, Scanner scanner){
        int userinput, index;

        // This prompts the user to enter an integer that we can search for in the array
        System.out.println("Enter Number: " );
		userinput = scanner.nextInt();

        // This for loop goes through the all the items of the array
        index = Arrays.binarySearch(userints, userinput);

        if(index >= 0){
            System.out.println("the number found at index " + index);
        } else {
            System.out.println("number not found in this array");
        }

    }

    public int[] arrayCopyAndReverse(int[] original, int size){
        // This copies and reverses the order of the values in an array
        // Declare array
        int[] reverse = new int[size];
        int[] copy = new int[size];

        // Copy the original array 
        copy = Arrays.copyOf(original, original.length);

        // Reverse the order of the copy array
        for (int i = 0; i < copy.length; i++) {
            reverse[i] = copy[copy.length - 1 - i];
        }

        return reverse;
    }

    public int sumInArray(int[] userints){
        // This function calculates the sum of values in an array

        int sum = 0;

        for (int num : userints) {
            sum += num;
        }

        return sum;
    }

    public int productInArray(int[] userints){
        // This function calculates the product of values in an array

        int prod = 1;

        for (int num : userints) {
            prod *= num;
        }

        return prod;
    }

    public static void main(String[] args){
        // New Scanner object
		Scanner scanner = new Scanner(System.in);

        // Declare UserArrays object
        UsersArrays user = new UsersArrays();

        // Declare array and initialize the size of the array
        int myarraysize = 15;
        int[] myarray = new int[myarraysize];

        // Take 15 inputs from a user to form an array
        user.getUserInput(myarray, myarraysize, scanner);
        
        // Prints arrays for the user
        System.out.println(Arrays.toString(myarray));

        // User Searches through the array for a specific number
        user.searchInArray(myarray, scanner);
        
        // Creates a new array with the values of original array however in reverse order
        int[] reversemyarray = user.arrayCopyAndReverse(myarray, myarraysize);
        System.out.println(Arrays.toString(reversemyarray));
        
        // Calculates the sum of all the values in the array
        int sum = user.sumInArray(myarray);
        System.out.println("The sum of array is " + sum);

        // Calculates the product of all the values in the array
        int prod = user.productInArray(myarray);
        System.out.println("The Product of array is " + prod);

        // Close the scanner
		scanner.close(); 
    }

}