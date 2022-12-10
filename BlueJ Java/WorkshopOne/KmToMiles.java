import java.util.Scanner;

public class KmToMiles{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double m=0.62137119;
        System.out.println("please enter the distance in km: ");
        int km = in.nextInt();
        double convert=km*m;
        System.out.println("the value is"+convert);
    }
}