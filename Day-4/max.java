public class max {
    public static void main(String toxic[]){
        int a=30;
        int b=28;
        int c=20;
        max Max= new max();
        int max = Max.findMax(a,b,c);
        System.out.println("The Maximium number is = "+max);
    }
    int findMax(int num1,int num2,int num3){
        if(num1>num2 && num1>num3){
           return num1;
        }
        else if(num2>num1 && num2>num3){
           return num2;
        }
        else{
            return num3;
        }
    }
}
