import java.util.Scanner;

class sevenc{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your college credits: ");
        int c=in.nextInt();
        
        if (c>=90){
            System.out.println("Senior Status");
        }else if(c>=60){
            System.out.println("Junior Status");
        }else if(c>=30){
            System.out.println("Sophomore Status");
        }else{
            System.out.println("Freshman Status");
        }
    }
}