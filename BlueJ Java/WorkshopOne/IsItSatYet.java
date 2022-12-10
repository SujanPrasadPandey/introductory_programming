import java.util.Scanner;

public class IsItSatYet{
    public static void main (String[] Args){
        Scanner in = new Scanner(System.in);
        System.out.println("What day is it today? ");
        String day = in.nextLine();
    
        System.out.println("it is "+day);
    }
}