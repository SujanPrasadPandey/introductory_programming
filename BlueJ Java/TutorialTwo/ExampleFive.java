import java.util.Scanner;

public class ExampleFive{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String result=number%2==0?"even":"odd";
        System.out.println(result);
    }
}