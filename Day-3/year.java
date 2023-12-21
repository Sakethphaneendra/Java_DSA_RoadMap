import java.lang.*;
import java.util.Scanner;

public class year {
    public static void main(String sd[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Year : ");
        int year = in.nextInt();

        if(year%4==0 || year%400==0)
        {
            System.out.println("The year "+year+" is a leap year.");
        }
        else{
            System.out.println("The year "+year+" is not a leap year.");

        }
        
        }
    }

