import java.util.Scanner;

public class MToKm{
    public static void main(String[] args){
        double km=1000.0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter meter :");
        double m=in.nextInt();
        double conversion=m/km;
        System.out.println("Meter:"+m+", Kilometer: "+conversion);
    }
}