class Three{
    public static void main(String[] args){
        boolean a=true && true;
        boolean b=true && false || true;
        boolean c=false && false || true;
        boolean e=!(false) && true;
        boolean f=!(true && !(false &&false));
        boolean g=(10 > 14) && (4 == 5);
        boolean i=(3 * 4) != (14 - 2) && ('C' >= 'D');
        boolean j=(12 * 2) == (3 * 8);
        boolean k=(14 * 2) != (3 * 8);
        
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("e: "+e);
        System.out.println("f: "+f);
        System.out.println("g: "+g);
        System.out.println("i: "+i);
        System.out.println("j: "+j);
        System.out.println("k: "+k);
    }
}