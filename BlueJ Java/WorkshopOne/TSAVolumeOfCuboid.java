public class TSAVolumeOfCuboid{
    public static void main(String[] args){
        int l=3;
        int h=3;
        int w=3;
        int tsa=2*((l*h)+(l*w)+(h*w));
        int volume=l*w*h;
        System.out.println("the total surface area is: "+tsa);
        System.out.println("the volume is: "+volume);
    }
}