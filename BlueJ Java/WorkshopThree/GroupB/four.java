import java.util.Scanner;
class four{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        int i;
        int sum=1;
        
        System.out.print("Enter the number: ");
        int num=in.nextInt();
        for (i=1;i<=num;i++){
            sum=sum*i;
        }
        System.out.println(sum);
    }
}