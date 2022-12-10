import java.util.Scanner;

class six{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        double num;
        int pn=0,nn=0,z=0;
        char c;
        int i=1;
        
        do{
            System.out.print("Enter a number: ");
            num=in.nextDouble();
            
            if(num>0){
                pn=pn+i;
            }else if(num<0){
                nn=nn+i;
            }else{
                z=z+i;
            }
            
            System.out.print("Press Y to continue putting data: ");
            c=in.next().charAt(0);
        }while((c=='Y') || (c=='y'));
        
        System.out.printf("%nIn the data you entered %nPositive numbers : "+pn+"%nNegative numbers : "+nn+"%nZeros : "+z);
    }
}