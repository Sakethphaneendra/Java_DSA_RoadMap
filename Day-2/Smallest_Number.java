import java.lang.*;
import java.util.Scanner;
class Smallest_Number{
    public static void main(String ar[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter 3 Number : " );
        int Num1 = in.nextInt();
        int Num2 = in.nextInt();
        int Num3 = in.nextInt();
        in.close();

        if(Num1<Num2 && Num1 < Num3)
        {
            System.out.println("THe Smallest Number " + Num1);
        }
        else if(Num2<Num1 && Num2 < Num3){
            System.out.println("THe Smallest Number " + Num2);

        }
        else{
             System.out.println("THe Smallest Number " + Num3);

        }
    }
}