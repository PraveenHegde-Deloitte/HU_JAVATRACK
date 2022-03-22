import java.io.*;
import java.util.Scanner;

public class deleteusers
{
    public void deleteusers()throws IOException
    {
                String id;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the user id to update");
                id = sc.next();
                System.out.println("Enter what you want to delete:\n");
                System.out.println("1.Name\n 2.Age\n 3.Company\n 4.Designation\n 5.Salary\n 6.Address\n 7.Phone number\n");
                String name, company, designation, salary, address, phone;
                int age;
                int n = sc.nextInt();
                try {
                    BufferedReader file1 = new BufferedReader(new FileReader("C:\\Users\\prhegde\\Ideaprojects\\HU_JAVATRACK\\Main_Assignment\\add_usersdata.csv"));
                    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\prhegde\\Ideaprojects\\HU_JAVATRACK\\Main_Assignment\\add_userdata1.csv")));
                    String nam;
                    int flag = 0;
                    while ((nam = file1.readLine()) != null) {
                        String[] line = nam.split(",");
                        if (!id.contains(line[0])) {
                            pw.println(nam);
                            flag = 0;
                        } else {
                            if (n == 1) {
                                name = " ";
                                pw.printf("%s,%s,%s,%s ,%s,%s,%s,%s\n", id, name, line[2], line[3], line[4], line[5], line[6], line[7]);
                            }
                            else if(n==2) {
                                age=0;
                                pw.printf("%s,%s,%d,%s ,%s,%s,%s,%s\n", id, line[1], age, line[3], line[4], line[5], line[6], line[7]);
                            }
                            else if(n==3) {
                                company=" ";
                                pw.printf("%s,%s,%s,%s ,%s,%s,%s,%s\n", id, line[1], line[2], company, line[4], line[5], line[6], line[7]);
                            }
                            else if(n==4)
                            {
                                designation=" ";  pw.printf("%s,%s,%s,%s ,%s,%s,%s,%s\n", id, line[1], line[2], line[3], designation, line[5], line[6], line[7]);  }else if(n==5) {
                                salary=" ";  pw.printf("%s,%s,%s,%s ,%s,%s,%s,%s\n", id, line[1], line[2], line[3], line[4], salary, line[6], line[7]);  }else if(n==6) {
                                address=" ";  pw.printf("%s,%s,%s,%s ,%s,%s,%s,%s\n", id, line[1], line[2], line[3], line[4], line[5], address, line[7]);  }else if(n==7) {
                                phone=" ";  pw.printf("%s,%s,%s,%s ,%s,%s,%s,%s\n", id, line[1], line[2], line[3], line[4], line[5], line[6], phone);  }else{
                                System.out.println("Invalid Input"); }
                        }
                    }
                    file1.close();  pw.flush();  pw.close();  File delName = new File("adduser.csv");  File oldName = new File("main2.csv");  File newName = new File("adduser.csv");  if (delName.delete())
                        System.out.println("Records deleted");  else System.out.println("Error");  if (oldName.renameTo(newName))
                        System.out.println("Deleted successfully");  else System.out.println("Error");  } catch (FileNotFoundException e) {
                    System.out.println("File not found");  } catch (IOException e) {
                    e.printStackTrace();  }
                user_data ud = new user_data();
                ud.user_data();
    }

}
