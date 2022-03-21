public class exception_handling_1_arithmatic_exception
{
    public static void main(String[] args)
    {
        try
        {
            int a = 20;
            int b = 0;
            int div = a/b;
            System.out.println("result =" +div);
        }
        catch ( ArithmeticException e)
        {
            System.out.println("arithmatic exception occured" +e);
        }
        finally {
            System.out.println("Thank you");
        }
    }
}
