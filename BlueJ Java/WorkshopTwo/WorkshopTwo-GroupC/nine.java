 import java.util.Scanner;

class nine{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the size of the tshirt (1 to 4): ");
        int size=in.nextInt();
        
        switch(size){
            case 1:
                System.out.println("Available");
                break;
            case 2:
                System.out.println("Not Available");
                break;
            case 3:
                System.out.println("Not Available");
                break;
            case 4:
                System.out.println("Available");
                break;
        }
    }
}