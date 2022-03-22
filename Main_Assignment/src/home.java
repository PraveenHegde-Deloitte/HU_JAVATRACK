import java.util.Scanner;

public class home
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("-----------WELCOME TO USER DATABASE-----------");
        System.out.println("1.LOGIN");
        System.out.println("2.REGISTER");
        System.out.println("Select an option");
        int p=Sc.nextInt();
        if(p==1)
        {
            login lg = new login();
            lg.login();

        }
        else if(p==2)
        {
            register reg = new register();
            reg.register1();
        }
        else
        {
            System.out.println("Enter an valid Option");
        }

    }
}
