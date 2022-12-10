import java.util.Scanner;
public class one{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=in.nextInt();
        
        if(num>0){
            System.out.println("The number is positive.");
        }else if(num<0){
            System.out.println("The number is negative.");
        }else{
            System.out.println("The number is zero.");
        }
    }
}
