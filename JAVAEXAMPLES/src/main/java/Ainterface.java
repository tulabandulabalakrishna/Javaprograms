public interface Ainterface {

    int a = 5;
    default public void sum(){System.out.println(" method  Ainterface");};

    public void multiply();

    static void divide()
    {
        System.out.println("sttic method in A interface");
    }

    default void mod(){System.out.println(" method  MOD A interface");}




}
