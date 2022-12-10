import java.util.Scanner;
class Three{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of seconds to be converted: ");
        double sec=in.nextInt();
        int seca=(int)sec;
        
        double hb=sec/60/60;
        int ha=(int)hb;
        
        double m=hb-ha;
        double mb=m*60;
        int ma=(int)mb;
        
        double s=mb-ma;
        double sb=s*60;
        int sa=(int)sb;
        
        System.out.println(seca+" Seconds is: "+ha+
        " Hours, "+ma+" Minutes and "+sa+" Seconds.");
    }
}