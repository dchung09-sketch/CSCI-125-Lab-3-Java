/*
Name: Daniel Chung
ID: 1331774
Course: CSCI 125 Programming 1
Section: M01
Lab 3 Problem 5: Check if a character is a Vowel or Consonant
Good Evening professor, when doing Problem 5, I had included the possibility that the letters (y and w) could also be a vowel all depending on the situation that they are in through grammar.
 */

import java.util.Scanner;// This is the starting base for various objects/blueprints
public class DanielChung_Prob5 {// This class is the starting design for creating various code

    public static void main(String[] args) {// This is the JavaScript entry level code to create strings as arguments
        Scanner scanner = new Scanner(System.in);// This is a new scanner object that is able to read inputs
        System.out.println("Pick and Enter any of the 26 Alphabetical Letters within the English Language to determine if it is a Vowel or a Consonant in Lowercase:");// The output of the text is printed in green and it is asking the user to provide a letter from the alphabet
        char userletterselected = scanner.next().charAt(0);// The alphabetical value is stored between the label "userletterselected"
        if (userletterselected == 'a' || userletterselected == 'e' || userletterselected == 'i' || userletterselected == 'o' || userletterselected == 'u') {// This is an if statement identifying subjects that the letters "a,e,i,o and u" are all vowels
            System.out.println("The letter " + userletterselected + " that was provided by the user is known to be an English Vowel. This letter that represents a speech sound made without obstruction while speaking.");// The out is proving the green text on the screen with the alphabet letter to let the user know that it is a vowel
        } else if (userletterselected == 'y' || userletterselected == 'w') {// This is an else if statement to identify that the letters (y and w) are consonants that could sometimes be used as vowels in certain situations
            System.out.println("Depending on the situation of the sentence being spoken, sometimes y and w could possibly be Vowels even though they are consonants because they sometimes have vowel sounds and can be used in place of a vowel when using words such as (gym,cry, cow and how).");// The output is being printed in green text towards the user
        } else// This is an else statement to identify that if the letter provided doesn't match the values (a,e,i,o,u, y and z), then the letter the user provided is a consonant
            System.out.println("The letter provided by the user " + userletterselected + " is identified to be a consonant, a letter that stands for a sound when individuals speak.");// The output would be the green text and letting the user know that the letter they have provided is a consonant
        scanner.close();// This is the closing unit for all else-if statements
    }// This is the end block of code for the "public static void main(String[] args)" statement
}// This is the end block of code for the "public class Main" blueprint code that was created
