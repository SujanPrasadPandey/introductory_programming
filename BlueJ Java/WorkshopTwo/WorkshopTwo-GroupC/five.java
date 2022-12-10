import java.util.Scanner;
class five{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        double num1=in.nextDouble();
        
        System.out.println("Enter second number: ");
        double num2=in.nextDouble();
        
        double sum,diff,mult,div,mod,exp;
        sum = num1+num2;
        diff = num1-num2;
        mult = num1*num2;
        div = num1/num2;
        mod = num1%num2;
        exp = Math.pow(num1, num2);
        
        System.out.println("Addtion: "+num1+" + "+num2+" = "+sum);
        System.out.println("Subtraction: "+num1+" - "+num2+" = "+diff);
        System.out.println("Multiplication: "+num1+" * "+num2+" = "+mult);
        System.out.println("Division: "+num1+" / "+num2+" = "+div);
        System.out.println("Modulus: "+num1+" % "+num2+" = "+mod);
        System.out.println("Exponentiation: "+num1+" ** "+num2+" = "+exp);
    }
}