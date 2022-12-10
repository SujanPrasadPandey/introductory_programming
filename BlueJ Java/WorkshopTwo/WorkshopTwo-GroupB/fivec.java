import java.util.Scanner;

class fivec{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter your body temperature: ");
        float current_temperature=input.nextFloat();
        
        System.out.println("Your body temperature is: "+current_temperature);
    }
}