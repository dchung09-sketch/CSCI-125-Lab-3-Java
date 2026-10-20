/*
Name: Daniel Chung
ID: 1331774
Course: CSCI 125 Programming 1
Section: M01
Lab 3 Problem 1: Determine if a number is positive, negative or zero
 */

import java.util.Scanner;// This is the starting base for various objects/blueprints
public class DanielChung_Prob1{// This class is the starting design for creating various code
      public static void main(String[] args) {// This is the JavaScript entry level code to create strings as arguments
          Scanner scanner = new Scanner(System.in);// This is a new scanner object that is able to read inputs
          System.out.println("Enter and Provide any integer number of your choice from any range! ");// The output of the code is provided in the Green Text.
          int usernumberprovided = scanner.nextInt();// The integer value is stored between the label "usernumberprovided"
          if (usernumberprovided > 0) {// This is an if statement created to identify if the number provided is greater than zero
              System.out.println("The number that you have provided is determined to be a Positive Number!");// If the number is greater than zero, the output would be the text in green
          } else if (usernumberprovided < 0){// This is an "else if" statement identifying if the integer provided by the user is less than zero
              System.out.println("The Number that you have provided is determined to be a Negative Integer!");// If the integer provided is less than zero, the output would be the text in green
          } else {// This is an "else" statement identifying that if the integer provided doesn't meet any requirements of being greater or less than zero
              System.out.println("The number that you have provided is not positive or negative, but it determined to be Zero!");// The output would determine to be zero and the output would be the text in green
              scanner.close();// The scanner is prompted to be closed
          }// This is the closing unit for all else-if statements
    }// This is the end block of code for the "public static void main(String[] args)" statement
}//This is the end block of code for the "public class Main" blueprint code that was created