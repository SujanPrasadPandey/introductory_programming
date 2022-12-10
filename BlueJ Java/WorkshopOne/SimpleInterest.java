import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Principal: ");
        double p=in.nextDouble();
        
        System.out.println("Enter Rate: ");
        double r=in.nextDouble();
        
        System.out.println("Enter Time: ");
        double t=in.nextDouble();
        
        double si=(p*r*t)/100;
        double ta=p*(1+(r*t));
        
        System.out.println("Simple Interest is: "+si+", and Total Amount is: "+ta);
    }
}