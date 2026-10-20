/*
Name: Daniel Chung
ID: 1331774
Course: CSCI 125 Programming 1
Section: M01
Lab 3 Problem 3: Compare two floating-point numbers
 */

import java.util.Scanner;// This is the starting base for various objects/blueprints
public class DanielChung_Prob3 {// This class is the starting design for creating various code

    public static void main(String[] args) {// This is the JavaScript entry level code to create strings as arguments
        Scanner scanner = new Scanner(System.in);// This is a new scanner object that is able to read inputs
        System.out.println("Please Enter the First Double Number of your Choice from any Range! (It could also be a decimal number): ");// The initial output of the code would be the green text asking the user to provide a double number
        double thefirstusernumprovided1 = scanner.nextDouble();//The first double value is stored between the label "thefirstusernumprovided1"
        System.out.println("Please Enter the Second Integer Number of your Choice from Any Range! (This could also be a decimal number):");// The output is asking the user to input a second double value and the text highlighted would be in green
        double thesecondusernumprovided2 = scanner.nextDouble();//The second double value is stored between the label "thesecondusernumberprovided2"
        if (thefirstusernumprovided1 > thesecondusernumprovided2) {// This is an if statement stating the decision to determine is the first double number is greater than the second double number
            System.out.println("The very First Number what was provided first "  +thefirstusernumprovided1+  " is bigger and greater than the Second Number " +thesecondusernumprovided2+ " that you have provided!");//If the first double number is greater than the second number proved, the output would be the green text and it would provide the greater number between two
        } else if (thesecondusernumprovided2 > thefirstusernumprovided1) {// This is an else if statement this determining if the second double number provided is greater than the first double number that was initially provided
            System.out.println("The second number that you have provided " +thesecondusernumprovided2+ " is determined to be greater than the very first number that you have Provided!"  + thesecondusernumprovided2);// If the second double number is greater than the first double number, the output would be the green highlighted text and provide the greater number between the two
        } else {// This is an else statement that would be activated if both of the initial double numbers are not greater or less than each other at the time being, the output is that they are both equal to each other
            System.out.println("It is actually determined that both the first " +thefirstusernumprovided1+ " and second numbers that you have provided " +thesecondusernumprovided2+ " are indeed to be equal to each other!");// The output would be the text labeled in green and it would be determined that the both the first and second double numbers are equal to each other
            scanner.close();// This is prompting the current and initial scanner to be closed.
        }//This is the closing unit for all else-if statements
    }//This is the end block of code for the "public static void main(String[] args)" statement
}//This is the end block of code for the "public class Main" blueprint code that was created

