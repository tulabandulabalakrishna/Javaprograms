public class ExceptionHandler1 {

    public void divide(int a , int b)
           // throws ArithmeticException
    {
        /*if(b==0)
        {
            throw new UserDefinedException("USR thrown");
        }*/
        try {
            System.out.println(a / b);
            System.out.println("Program exeucted after exeption.");
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            System.out.println("fainally in Call A last");
        }
    }

    }






