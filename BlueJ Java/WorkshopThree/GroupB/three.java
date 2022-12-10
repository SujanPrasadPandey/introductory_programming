import java.util.Scanner;

class three{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int num=in.nextInt();
        
        int i,ans;
        
        for (i=1;i<=30;i++){
            ans=num*i;
            System.out.println(num+"*"+i+"="+ans);
        }
    }
}