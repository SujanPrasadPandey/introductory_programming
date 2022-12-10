import java.util.Scanner;

public class PenCopyPencil{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Quantity of Pen: ");
        int pen = in.nextInt();
        
        System.out.println("Enter Rate of a Pen: ");
        int rpen = in.nextInt();
        
        System.out.println("Enter Quantity of Copy: ");
        int copy = in.nextInt();
        
        System.out.println("Enter Rate of a Copy: ");
        int rcopy = in.nextInt();
        
        System.out.println("Enter Quantity of Pencil: ");
        int pencil = in.nextInt();
        
        System.out.println("Enter Rate of a Pencil: ");
        int rpencil = in.nextInt();
        
        int ta=(pen*rpen)+(copy*rcopy)+(pencil*rpencil);
        
        System.out.println("The total amount is: "+ta);
    }
}