import java.util.Scanner;

public class sumofnnumbers{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter the value of n: ");
        
        int n=in.nextInt();
        
        int sum=(n*(n+1))/2;
        
        System.out.println("the sum of first "+n+" natural numbers is "+sum);
    }
}
