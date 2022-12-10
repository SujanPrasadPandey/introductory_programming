import java.util.Scanner;

public class KgToG{
    public static void main(String[] args){
        
        double gram=1000;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter kg: ");
        
        int kg = in.nextInt();
        
        double convert=kg*gram;
        
        System.out.println("the value is"+convert);
    }
}