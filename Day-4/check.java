import java.util.Scanner;
public class check {
    public static void main(String args[])

{
    Scanner in = new Scanner(System.in);
    System.out.print("Enter an Number : ");
    int number = in.nextInt();
    in.close();
    check_status(number);
}
    static void check_status(int num){
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");

        }
    }
}
