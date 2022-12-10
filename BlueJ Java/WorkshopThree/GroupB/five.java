import java.util.Scanner;

class five{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int num=in.nextInt();
        
        System.out.print("Enter power: ");
        int pow=in.nextInt();
        
        System.out.println("The answer is: "+Math.pow(num,pow));
    }
}