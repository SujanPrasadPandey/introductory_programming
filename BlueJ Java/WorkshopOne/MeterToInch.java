import java.util.Scanner;

class MeterToInch{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        double inch=39.3701;
        
        System.out.println("Enter meter: ");
        double meter=in.nextDouble();
        
        double converted=inch*meter;
        System.out.println(meter+" converted into inch is: "+converted);
    }
}