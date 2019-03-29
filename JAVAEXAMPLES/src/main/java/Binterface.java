public interface Binterface extends Ainterface{

    //int a = 5;
    //public void sum();
    //public void print();
    public void multiply();
    static void divide()
    {
        System.out.println("static method in interface");
    }

    //default void sum(){System.out.println(" method  MOD B interface");}

    static void isNull(){
        System.out.println("Interface Null Check");
     }

}
