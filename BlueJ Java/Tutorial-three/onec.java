import java.util.Scanner;

class onec{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int sum,i;
        i=0;
        sum=0;
        
        System.out.println("Enter the number: ");
        int j=in.nextInt();
        while(i<=j){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of first 50 natural number is: "+sum);
    }
}