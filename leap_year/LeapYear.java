import java.util.Scanner;
public class LeapYear {
public static void main(String[] args) {
    // scanner helps to read input from the user
    Scanner scanner = new Scanner(System.in);
    // ask user to enter an year
    System.out.println("Enter Year");
    int Year = scanner. nextInt();
   if (isLeapYear(Year)) {
    // output after checking if the year is a leap year will be as follows
    System.out.println("The year you entered is a leap year.");
   } else {
    System.out.println("The year you entered is not a leap year");
   }
   scanner.close(); 
}
public static boolean
/* A leap year is divisible by 4, but not by 100
 unless it is also divisible by 400 */
isLeapYear(int year){
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
             } else {
                return false;
            }
          
        } else{
            return true;
        }
        
    } else {
        return false;
    }
}
    
}