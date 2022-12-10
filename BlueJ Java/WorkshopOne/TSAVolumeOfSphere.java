import java.util.Scanner;

public class TSAVolumeOfSphere{
    public static void main(String[] args){
        double pi=3.141592653589793238;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter radius of Sphere: ");
        double r=in.nextDouble();
        
        double tsa=4.0*pi*(r*r);
        double v=(4.0/3.0)*pi*(r*r*r);
        
        System.out.printf("The total surface area of the sphere is: "+tsa+", %n and volume of the sphere is: "+v);
        
    }
}