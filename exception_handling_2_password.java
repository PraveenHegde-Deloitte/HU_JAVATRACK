import java.util.Scanner;

public class exception_handling_2_password
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Enter password");
        Scanner sc = new Scanner(System.in);

        String password = sc.next();

        try
        {
            validatePassword(password);
        }
        catch (PasswordException e)
        {
            System.out.println(e.getMessage());
        }
    }

    static void validatePassword(String password) throws PasswordException {
        if (password.length() < 5)
        {
            throw new PasswordException("Password length is less than 5");
        }
        if(password.length() > 10)
        {
            throw new PasswordException("Password length is greater than 10");
        }

        boolean upperCheck = false;
        boolean lowerCheck = false;
        boolean digitCheck = false;
        boolean  specialCharacterCheck =false;
        for (char c : password.toCharArray())
        {
            if (Character.isUpperCase(c))
            {
                upperCheck = true;
            }

            if (Character.isLowerCase(c))
            {
                lowerCheck = true;
            }
            if (Character.isDigit(c))
            {
                digitCheck = true;
            }
            if((password.contains("@")||password.contains("#")||password.contains("&")||password.contains("%")||password.contains("*")||password.contains("!")))
            {
                specialCharacterCheck = true;
            }
        }

        if (!upperCheck) {
            throw new PasswordException("uppercase character missing");
        }

        if (!lowerCheck) {
            throw new PasswordException ("lowercase character missing");
        }

        if (!digitCheck) {
            throw new PasswordException ("digit missing");
        }
        if(specialCharacterCheck == false)
        {
            throw new PasswordException("special char missing");
        }

        System.out.println("Valid password.");
    }

    static class PasswordException extends Exception {

        public PasswordException()
        {
            super("Invalid password");
        }

        public PasswordException(String message) {
            super("Invalid password: " + message);
        }
    }
}
