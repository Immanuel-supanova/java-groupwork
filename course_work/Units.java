/* This program asks the lecturer to input 3 marks for specific units, calculates the average and display the average to the user */ 
package unit_marks;

import java.util.Scanner;

public class Units{

    public void inputMarks(){
        int javaProgramming, networking, maths, average, userinput;

        // New Scanner object
		Scanner scanner = new Scanner(System.in);

        // Ask the lecturer for unit marks
        System.out.println("Enter marks for the following units:-\nJava Programming: ");
		javaProgramming = scanner.nextInt();
        System.out.println("Networking: ");
        networking = scanner.nextInt();
        System.out.println("Maths: ");
        maths = scanner.nextInt();

        // Calculate the average of the three units
        average = (javaProgramming + networking + maths)/3;

        // Display the unit marks and the calculated average
        System.out.println("\nmarks for java programming is: " + javaProgramming);
        System.out.println("marks for networking is: " + networking);
        System.out.println("marks for maths is: " + maths);
        System.out.println("the average is: " + average);

    }

    public static void main(String[] args){
        Units unit = new Units();
        unit.inputMarks();
    }

}