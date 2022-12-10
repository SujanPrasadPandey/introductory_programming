import java.util.Scanner;

public class PotentialEnergy{
   public static void main(String[] args){
        double g=9.8;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter mass: ");
        double m=in.nextDouble();
        System.out.println("Enter height: ");
        double h=in.nextDouble();
        double pe=g*m*h;
        System.out.println("The potential energy is: "+pe);
    }
}