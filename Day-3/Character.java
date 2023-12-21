// 5.Create a program to determine the type of a character (uppercase, lowercase, digit, etc.).

import java.lang.*;
import java.util.Scanner;

public class Character{
    public static void main(String a[]){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Character : ");
        char inputChar = in.next().charAt(0);
        in.close();
        if (java.lang.Character.isUpperCase(inputChar)) {
            System.out.println("The character "+inputChar+" is an uppercase letter.");
        } else if (java.lang.Character.isLowerCase(inputChar)) {
            System.out.println("The character "+inputChar+" is a lowercase letter.");
        } else if (java.lang.Character.isDigit(inputChar)) {
            System.out.println("The character "+inputChar+" is a digit.");
        } else if (java.lang.Character.isWhitespace(inputChar)) {
            System.out.println("The character "+inputChar+"is a whitespace character.");
        } else {
            System.out.println("The character "+inputChar+" is a special character.");
        }
    }
}
