//2.Create a program to find the maximum of two numbers using conditional statements.

import java.lang.*;
import java.util.Scanner;
public class Maximum_Number {
    public static void main(String asf[])
{
    System.out.print("Enter two number : ");
    Scanner input = new Scanner(System.in);
    int number1 = input.nextInt();
    int number2 = input.nextInt();

    if(number1<number2)
    {
        System.out.println("Numbers "+number2+" are Mamimum");
    }else if (number1>number2){
        System.out.println("Numbers "+number1+" are Mamimum");
    }
    else{
        System.out.println("Both numbers are equal");
    }
}

}