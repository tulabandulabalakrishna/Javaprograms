public class AbstractExtends extends AbstractCLS implements Binterface{

    public void print()
    {
        System.out.println("HAI extends in print");
    }

    public void multiply()
    {
        System.out.println("static method in interface");
    }

//    public void sum()
//    {
//        System.out.println(" Abstract Extends in java");
//    }

    //    public void sum() {
//        System.out.println("AbstractExtends SUM METHOD");
//    }
    public static void main(String args[])
    {
        AbstractExtends a = new AbstractExtends();
        a.print();
        a.sum();

    }
}
