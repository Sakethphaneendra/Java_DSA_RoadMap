//3.Implement a program to check if a person is eligible to vote.

import java.util.Scanner;
import java.lang.*;



public class Voting_Critera {

    public static void main(String ar[])
    {
        System.out.print("enter your age : ");
        Scanner input = new Scanner(System.in);
        int Age = input.nextInt();
        if(Age>=18){
            System.out.print("person is eligible ");
        }
        else{
            System.out.print("person is not eligible ");

        }
    }
    
}
