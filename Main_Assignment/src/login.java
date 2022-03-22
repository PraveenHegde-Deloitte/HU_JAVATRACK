import java.io.*;
import java.util.Scanner;
    public class login
    {
        void login()
        {
            String name;
            String password;
            System.out.println("Enter the name");
            Scanner sc=new Scanner(System.in);
            name=sc.next();
            System.out.println("Enter the password");
            password=sc.next();
            String line=" ";
            String splitBy=",";
            Boolean c=false;
            int flag=0;
            try {
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\prhegde\\Ideaprojects\\HU_JAVATRACK\\Main_Assignment\\Data_main.csv"));
                while ((line = br.readLine()) != null) {
                    String[] m = line.split(splitBy);
                    if ((m[0].contains(name) && m[1].contains(password))) {
                        flag++;
                    }
                }
                if(flag==1)
                {
                    System.out.println("Login Is Successfull");
                    user_data hh = new user_data();
                    hh.user_data();
                }
                else
                    System.out.println("invalid name or Password");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
