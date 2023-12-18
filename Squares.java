// 1.Write a function to calculate the square of a number.
import java.util.Scanner;
public class Squares{
    public static void main(String[] happy){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();
        int value = Squaring(number);
        System.out.println("The Square of number is "+ value);
    }
  static int Squaring(int number){
     int numbers= number * number;
     return numbers;

    }
}
