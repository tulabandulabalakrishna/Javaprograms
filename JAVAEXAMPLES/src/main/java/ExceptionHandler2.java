public class ExceptionHandler2  {

    //ExceptionHandler1 e;
   /* public void sum(int a, int b , ExceptionHandler2 e)

    {
        System.out.println(a+b);
        try {
            e.divide(a, b);

        }
        finally
        {
           System.out.println("In finally block") ;
        }

    }*/
    public static void main(String args[])
    {
        ExceptionHandler1 e = new ExceptionHandler1();
        try{
            e.divide(1,0);
            System.out.println("Try after exception");
        }
        /*catch(ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }*/
       /* catch(UserDefinedException ex1)
        {
            System.out.println(ex1.getMessage());
        }*/

        finally
        {
            System.out.println("fainally after last");
        }
        System.out.println("Try after last");


    }




}
