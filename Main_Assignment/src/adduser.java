import java.util.Scanner;
import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class adduser
{
    void user()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter user-id");
        String user_id =sc.next();
        System.out.println("Enter name");
        String name=sc.next();
        System.out.println("Enter age");
        int age=sc.nextInt();
        if(age >= 19 && age <= 90)
        {
            System.out.println("");
        }
        else
        {
            System.out.println("enter the proper age");
        }
        System.out.println("Enter company name");
        String company_name= sc.next();
        System.out.println("Enter Designation");
        String designation=sc.next();
        System.out.println("Enter salary");
        int salary=sc.nextInt();
        if(salary >= 0)
        {
            System.out.println("");
        }
        else
        {
            System.out.println("Enter salary Greater than 0");
        }
        System.out.println("Enter Address");
        String address=sc.next();
        System.out.println("Enter phone number");
        String phone_number=sc.next();
        boolean q=true;
        while(q) {
            System.out.println("Phonenumber:");
            phone_number = sc.next();
            if(phone_number.matches("^[0-9]{10}$")){
                q=false;
            }
            else{
                q=true;
                System.out.println("enter 10 digit number");
            }
        }
        System.out.println("User details added successfully");
        String line=" ";
        String splitBy=",";
        int i=0;
        try {
            FileWriter fr = new FileWriter("C:\\Users\\prhegde\\Ideaprojects\\HU_JAVATRACK\\Main_Assignment\\add_userdata.csv",true);
            PrintWriter printWriter = new PrintWriter(fr);
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\prhegde\\Ideaprojects\\HU_JAVATRACK\\Main_Assignment\\add_userdata.csv"));
            while ((line = br.readLine()) != null) {
                String[] rank = line.split(splitBy);
                if ((rank[0].contains(user_id) || rank[0].contains("user_id"))) {
                    i++;
                }
            }
            if(i==0){

                printWriter.printf("%s,%s,%d,%s,%s,%d,%s,%s\n",user_id,name,age,company_name,designation,salary,address,phone_number);
                // check=true;
            }
            printWriter.close();
            user_data ud = new user_data();
            ud.user_data();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
