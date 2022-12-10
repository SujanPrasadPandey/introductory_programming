import java.lang.Math;

public class AreaOfTriangle{
    public static void main(String[] args){
        double a=5.0;
        double b=4.0;
        double c=3.0;
        double s=(a+b+c)/2.0;
        double area=(s*(s-a)*(s-b)*(s-c));
        System.out.println(Math.sqrt(area));
    }
}