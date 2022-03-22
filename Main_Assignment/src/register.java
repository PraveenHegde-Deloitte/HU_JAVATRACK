import java.io.*;
import java.util.Scanner;
public class register
{
    public boolean validatepass(String pass){

    if (!((pass.length() >= 5)
            && (pass.length() <= 10))) {
        return false;
    }

    // validation for capital letters
    if (true) {
        int f = 0;
        for (int i = 65; i <= 90; i++) {

            char c = (char)i;
            String str1 = Character.toString(c);
            if (pass.contains(str1)) {
                f = 1;
            }
        }
        if (f == 0) {
            return false;
        }
    }

    // validatiom for small letters
    if (true) {
        int f = 0;
        for (int i = 90; i <= 122; i++) {
            char c = (char)i;
            String str1 = Character.toString(c);
            if (pass.contains(str1)) {
                f = 1;
            }
        }
        if (f == 0) {
            return false;
        }
    }

    // validate digits from 0 to 9
    if (true) {
        int f = 0;
        for (int i = 0; i <= 9; i++) {

            String str1 = Integer.toString(i);
            if (pass.contains(str1)) {
                f = 1;
            }
        }
        if (f == 0) {
            return false;
        }
    }

    // validation for special characters
    if (!(pass.contains("@") || pass.contains("#")
            || pass.contains("!") || pass.contains("%")
            || pass.contains("&") || pass.contains("*"))) {
        return false;
    }

    return true;
}
    public void register1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username");
        String name = sc.next();

        System.out.println("Enter Password");
        String password = sc.next();
        boolean bl = validatepass(password);
        if(!bl){
            System.out.println("Password did not meet criteria");
            System.exit(0);
        }
        System.out.println("Re-enter Password");
        String rpass = sc.next();
        String line = " ";
        String splitBy = ",";
        Boolean check = false;
        int i = 0;
        if(password.equals(rpass))
        {
            try
            {
                FileWriter fr = new FileWriter("C:\\Users\\prhegde\\Ideaprojects\\HU_JAVATRACK\\Main_Assignment\\Data_main.csv", true);
                PrintWriter printWriter = new PrintWriter(fr);
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\prhegde\\Ideaprojects\\HU_JAVATRACK\\Main_Assignment\\Data_main.csv"));
                while ((line = br.readLine()) != null)
                {
                    String[] rank = line.split(splitBy);
                    if ((rank[0].contains(name) || rank[0].contains("name")))
                    {
                        i++;
                    }
                }
                if (i == 1)
                {

                    printWriter.printf("%s ,%s\n", name, password);
                    check = true;
                }
                printWriter.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            if (check == true)
            {
                System.out.println("Registration successfull");
            } else
            {
                System.out.println("Registration unsuccessfull: User already exists");
            }

        }
        else
        {

            System.out.println("Password mismatch");
        }


    }
}