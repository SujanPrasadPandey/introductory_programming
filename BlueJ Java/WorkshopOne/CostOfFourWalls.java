public class CostOfFourWalls{
    public static void main (String[] args){
    int l=10;
    int b=20;
    int h= 30;
    int Area= 2*(l+b)*h;
    int cost=20;
    int ans=Area*cost;
    System.out.printf("The cost of painting four walls of total area: "+Area+"%n when the cost of painting one square inch is: "+cost+"%n is : "+ans);
  }
}