
import java.util.Scanner;
public class Triangle_Type {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3 angle of triangle : ");
        int angle1 = input.nextInt();
        int angle2 = input.nextInt();
        int angle3 = input.nextInt();

        if(angle1==angle2 && angle2 == angle3)
        {
            System.out.println("The Triangle is equilateral.");
        }
        else if(angle1==angle2 || angle2 == angle3 || angle1 == angle3)
        {
            System.out.println("The Triangle is isosceles.");
        }
        else{
            System.out.println("The Triangle is scalene.");
        }

    }
}
