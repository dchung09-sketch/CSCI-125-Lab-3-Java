/*
Name: Daniel Chung
ID: 1331774
Course: CSCI 125 Programming 1
Section: M01
Lab 3 Problem 2: Check is a Person is eligible to vote
 */

import java.util.Scanner;// This is the starting base for various objects/blueprints
public class DanielChung_Prob2 {// This class is the starting design for creating various code

    public static void main(String[] args) {// This is the JavaScript entry level code to create strings as arguments
        Scanner scanner = new Scanner(System.in);// This is a new scanner object that is able to read inputs
        System.out.println("Enter your current age at the time being and see if you are eligible to vote in the Upcoming 2024 Election!");// The code is asking the individual to provide their age number in the output ig green text
        int useragenumprovided = scanner.nextInt();// The integer value is stored between the label "useragenumprovided"
        if (useragenumprovided >= 0 && useragenumprovided <= 17) {// This is an if statement stating, if the number is greater or equal to zero and less than or equal to 17
            System.out.println("You are not old enough yet to vote in the 2024 United States Election. Please Complete the registration to vote when you turn 18 years old.");// The output would be the text in green and the individual would be able to vote
        } else if (useragenumprovided >= 18) {// This is an else if statement stating if the individual is greater than or equal to the age of 18
            System.out.println("Congratulations! You are eligible to vote in the 2024 United States Election! Please go to your nearest Polling Location to verify your identify and make sure to caste your vote on Tuesday, November 5th 2024!");// The output would be that the individual would be able to vote and the output would be the text in green.
        } else {// This is an else statement indicating that if the integer proivided does not meet any requirements of the the dats two if-else statements, the age provided is not a real age
            System.out.println("The Number You have Provided is not a Real Age, Please enter a your current age during the year of 2024.");// the output would be telling the user that they entered a non-real age, and that the output of the text would be the green writing
            scanner.close();//The scanner is being prompted to be closed
        }//This is the closing unit for all else-if statements
    }// This is the end block of code for the "public static void main(String[] args)" statement
}// This is the end block of code for the "public class Main" blueprint code that was created
