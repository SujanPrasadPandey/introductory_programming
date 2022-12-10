import java.util.Scanner;

class three{
    public static void main(String[] args){
        int num;
        int sum=0;
        char c;
        
        Scanner in=new Scanner(System.in);
        
        do{
            System.out.println("Enter the number: ");
            num=in.nextInt();
            
            sum=sum+num;
            
            System.out.println("Press 'Y' to continue adding numbers ");
            c=in.next().charAt(0);
        }while ((c=='Y') || (c=='y'));
        
        System.out.println("The sum is: "+sum);
    }
}