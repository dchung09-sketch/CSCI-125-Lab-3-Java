/*
//Name: Daniel Chung
//ID: 1331774
//Course: CSCI 125 Programming 1
//Section: M01
//Lab 3 Problem 4: Grade classification
 */

import java.util.Scanner;// This is the starting base for various objects/blueprints
public class DanielChung_Prob4 {// This class is the starting design for creating various code

    public static void main(String[] args) {// This is the JavaScript entry level code to create strings as arguments
        Scanner scanner = new Scanner(System.in);// This is a new scanner object that is able to read inputs
        System.out.println("Please enter the integer value of the final grade you have received to determine the Alphabetical Equivalence Final Grade within this Class.");//The output is asking the user to input their numerical final grade for an alphabetical grade
        int userfinalgrade = scanner.nextInt();// The integer value is stored between the label "userfinalgrade"
        if (userfinalgrade >= 90 && userfinalgrade <= 100) {// This is an if statement trying to determine if the numerical grade provided is greater than 90 and less than 100
            System.out.println("The Alphabetical Final Grade that you have received for this class is an (A) Congratulations!");// The output would be the green text indicating that the student has received an A for scoring 90-100
        } else if (userfinalgrade <= 89 && userfinalgrade >= 80) {// This is an else if statement indicating if the final grade is within the intervals of 80 and 89
            System.out.println("Final Grade that you have received for this class is an (B) Good Job!");// If the final grade is between 80-89, the output would be the green text and the student has received a B.
        } else if (userfinalgrade >= 70 && userfinalgrade <= 79) {// This else if statement is questioning whether the final grade entered is between the integers of 70-79
            System.out.println("The Alphabetical Final Grade that you have received for this class is an (C) You Passed.");// If the final grade is within the numbers of 70-79, the output is the green text prompted and the final grade is a C.
        } else if (userfinalgrade >= 60 && userfinalgrade <= 69) {// This is an else if statement questioning if the final grade is between the number 60-69
            System.out.println("The Alphabetical Final Grade that you have received for this class is an (D) Borderline Passed.");// If the final grade is between the numbers 60-69, the output would be the green text and the final grade is a D
        } else if (userfinalgrade < 60) {// This is an else if statement identifying if the final grade is less than a 60
            System.out.println("I regret to inform you that you have received an (F) within this class and this is an automatic failing grade. I believe you could work harder next time.");// If the final grade is less than a 60, the output is the green text provided and the final grade is an F
        } else if (userfinalgrade > 100) {// This is an else if statement identifying if the final grade is scored more than 100 points
            System.out.println("Student cannot get higher than a 100 in class and there is no alphabetical grade that resembles a score of more than 100. Nevertheless, if a student has received more than 100 points as a grade, they will receive an (A) Outstanding Performance!");// If the final grade is more than a 100, the output would be the green text and the student still receives an A.
            scanner.close();// The scanner is prompted to be closed
        }// This is the closing unit for all else-if statements
    }// This is the end block of code for the "public static void main(String[] args)" statement
}// This is the end block of code for the "public class Main" blueprint code that was created