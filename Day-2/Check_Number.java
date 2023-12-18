//1.Write a program to check if a number is positive, negative, or zero.

import java.util.Scanner;

public class Check_Number{

    public static void main(String arhs[]){
    System.out.print("Enter a number : ");
    Scanner input = new Scanner(System.in);    

    int number = input.nextInt();
    if(number<0){
        System.out.println("The number is negative.");
    }
    else if(number>0){
        System.out.println("The number is positive.");
    }
    else{
        System.out.println("The number is zero.");

    }

}

}