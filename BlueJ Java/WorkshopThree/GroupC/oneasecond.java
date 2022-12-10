import java.util.Scanner;

class oneasecond{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num;
        char c;
        int sum=0;
        
        do{
            System.out.print("Enter a number smaller then 100: ");
            num=in.nextInt();
            
            if(num<=100&&num>=0){
                sum=sum+num;
            }
            
            System.out.print("Press Y to continue adding number: ");
            c=in.next().charAt(0);
        }while((c=='Y') || (c=='y'));
        
        System.out.println("The total sum is: "+sum);
    }
}