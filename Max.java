// 2.Create a function to find the maximum of three numbers.
import java.util.Scanner;
public class Max {
    public static void main(String[] Happy){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int Maximum = Max(A,B,C);
        System.out.println("The Maximum value = 2"+Maximum);
    }

    static int Max(int a, int b, int c){

        int A = a , B=b, C=c;
        int Max = A;
        while(A>B){
            while(A>C){
                 Max = A;
            }
        }
         while(B>A){
            while(B>C){
                 Max = A;
            }
        }
         while(C>B){
            while(C>A){
                 Max = A;
            }
        }
        return Max;
    }
}
