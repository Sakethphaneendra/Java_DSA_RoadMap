import java.util.Scanner;

public class table {
    public static void main(String saf[])
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an Number : ");
        int number = in.nextInt();
        
        for(int i =1 ; i<=10;i++)
        {
            System.out.println(number+" * " +i+ " = "+(number * i) );
        }
    
    }


}
