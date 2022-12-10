import java.util.Scanner;

public class Ritcher{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        double ritcher = in.nextDouble();
        
        if (ritcher >= 8.0) {
            System.out.println("Most structures fall");
        }else if (ritcher >=7.0){
            System.out.println("Many buildings destroyed");
        }else {
            System.out.println("No buildings destroyed");
        }
    }
}