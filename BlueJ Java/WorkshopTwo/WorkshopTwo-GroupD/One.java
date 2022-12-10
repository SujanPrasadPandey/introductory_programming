import java.util.Scanner;

class One{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        double p99=0.30;
        double p499=0.28;
        double p799=0.27;
        double p1000=0.26;
        double pmore=0.25;
        
        System.out.printf("%nEnter the number of copies to be printed: ");
        int num=in.nextInt();
        
        if (num<=99){
            System.out.println("The total price is: "+num*p99);
        }else if (num<=499){
            System.out.println("The total price is: "+num*p499);
        }else if (num<=799){
            System.out.println("The total price is: "+num*p799);
        }else if (num<=1000){
            System.out.println("The total price is: "+num*p1000);
        }else if (num>=1000){
            System.out.println("The total price is: "+num*pmore);
        }else{
            System.out.println("Error! Please provide a suitable number");
        }
        
    }
}