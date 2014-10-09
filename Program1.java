/*
 * Zackary Endsley
 * 2/21/14
 * Program 1
 *
 * Program Description: This program takes an integer input between 1 and 100
 * and outputs the corresponding words to the user.
 */

package program1;

import java.util.Scanner;

public class Program1 {

    public static final int MINIMUM_NUMBER = 0;
    public static final int MAXIMUM_NUMBER = 100;

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int number = 0;
        String text = "";
        
        //Loops until valid input is received
        do {
            
            System.out.print("Enter a number between 0 and 100: ");
            number = keyboard.nextInt();
            
            //Easter Egg
            if (number > 9000){
                System.out.println("IT'S OVER 9000!");         
            }
            
        } while((number < MINIMUM_NUMBER)||(number > MAXIMUM_NUMBER));
        
        //Accounts for min, max, tens, and special cases
        if (number == MINIMUM_NUMBER) {
            text = "Zero";
        } else if (number == MAXIMUM_NUMBER) {
            text = "One Hundred";
        } else if (number >= 90) {
            text = "Ninety ";
            number -= 90;
        } else if (number >= 80) {
            text = "Eighty ";
            number -= 80;
        } else if (number >= 70) {
            text = "Seventy ";
            number -= 70;
        } else if (number >= 60) {
            text = "Sixty ";
            number -= 60;
         } else if (number >= 50) {
            text = "Fifty ";
            number -= 50;
        } else if (number >= 40) {
            text = "Fourty ";
            number -= 40;
        } else if (number >= 30) {
            text = "Thirty ";
            number -= 30;
        } else if (number >= 20) {
            text = "Twenty ";
            number -= 20;
         } else if (number == 19) {
            text = "Nineteen";
            number -= 19;
        } else if (number == 18) {
            text = "Eighteen";
            number -= 18;
        } else if (number == 17) {
            text = "Seventeen";
            number -= 17;
        } else if (number == 16) {
            text = "Sixteen";
            number -= 16;
         } else if (number == 15) {
            text = "Fifteen";
            number -= 15;
        } else if (number == 14) {
            text = "Fourteen";
            number -= 14;
        } else if (number == 13) {
            text = "Thirteen";
            number -= 13;
        } else if (number == 12) {
            text = "Twelve";
            number -= 12;
        } else if (number == 11) {
            text = "Eleven";
            number -= 11;
        } else if (number == 10) {
            text = "Ten";
            number -= 10;
        }
            
        //Deals with 1's place value & outputs answer    
         if (number == 9) {
            System.out.println(text + "Nine");
         } else if (number == 8) {
            System.out.println(text + "Eight");
         } else if (number == 7) {
            System.out.println(text + "Seven");
         } else if (number == 6) {
            System.out.println(text + "Six");
         } else if (number == 5) {
            System.out.println(text + "Five");
         } else if (number == 4) {
            System.out.println(text + "Four");
         } else if (number == 3) {
            System.out.println(text + "Three");
         } else if (number == 2) {
            System.out.println(text + "Two");
         } else if (number == 1) {
            System.out.println(text + "One");
         } else {
             System.out.println(text);
         }
    }
}