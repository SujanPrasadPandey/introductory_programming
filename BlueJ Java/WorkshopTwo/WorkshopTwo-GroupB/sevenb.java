import java.util.Scanner;

class sevenb{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter either A,B,C: ");
        char abc=input.next().charAt(0);
        
        if(abc=='A'){
            System.out.println("Apple");
        } else if(abc=='B'){
            System.out.println("Banana");
        } else if(abc=='C'){
            System.out.println("Coconut");
        } else{
            System.out.println("Please enter valid alphabet");
        }
    }
}