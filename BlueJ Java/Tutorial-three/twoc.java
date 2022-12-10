import java.util.Scanner;
class twoc{
    public static void main(String[] args){
        Scanner random=new Scanner(System.in);
        
        System.out.println("Enter a random value: ");
        int n=random.nextInt();
        
        for (int i=1; i<=10; i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}