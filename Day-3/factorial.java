
import java.util.Scanner;
public class factorial {
    
    public static void main(String ar[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Number : ");
        int number = in.nextInt();
        int fact=1;
        for(int i=2;i<=number;i++)
        {
            fact= fact*i;
        }
          System.out.print("The Factorial of the number is : "+ fact);
    }
}
