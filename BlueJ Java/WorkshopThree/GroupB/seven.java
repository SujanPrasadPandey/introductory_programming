import java.util.Scanner;

class seven{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        int n1=0,n2=1,n3=1,n;
        
        System.out.printf("%nEnter a number: ");
        n=in.nextInt();
        
        System.out.print(n1+" "+n2);
        
        do{
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            n3=n1+n2;
        }while(n3<=n);
    }
}