import java.util.Scanner;

public class PerimeterOfRectangle{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter length of rectangle: ");
        double a=in.nextDouble();
        
        System.out.println("enter height of rectangle: ");
        double b=in.nextDouble();
        
        double p=2*(a+b);
        
        System.out.println("The perimeter of rectangle is: "+p);
    }
}