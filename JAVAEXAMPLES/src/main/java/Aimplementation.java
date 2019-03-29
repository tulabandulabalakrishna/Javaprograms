public class Aimplementation implements  Binterface{

    int c = 2;
    int b = 5;

    public void sum()
    {
        System.out.println(c+b);
    }

    public void multiply()
    {
        System.out.println(c*b);
    }
    public void divide()
    {
        System.out.println("static method in implementation");
    }

    public  void isNull() {
        System.out.println("Aimp Null Check");


    }

    //public void mod(){System.out.println(" method  MOD implementation");}

    public static void main(String args[])
    {
        Aimplementation a = new Aimplementation();
        a.sum();
        a.multiply();
        System.out.println("interface value" + a.a);
        //System.out.println("interface value" + a.d);
        a.divide();
        a.mod();
        a.isNull();
    }
}
