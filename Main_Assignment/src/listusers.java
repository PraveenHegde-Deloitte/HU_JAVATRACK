import java.io.*;
import java.util.Scanner;

public class listusers
{
    private String name;

    void listusers()
            {
                String line=" ";
                String splitBy=",";
                Scanner sc =new Scanner(System.in);
                String userID = sc.next();
                        try {
                            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\prhegde\\Ideaprojects\\HU_JAVATRACK\\Main_Assignment\\add_userdata.csv"));
                            while ((line = br.readLine()) != null) {
                                String[] x = line.split(splitBy);
                                if(x[0].contains(userID)){
                                    System.out.println("user-ID:"+x[0]+"\n"+"name:"+x[1]+"\n"+"age:"+x[2]+"\n"+"Company:"+x[3]+"\n"+"Designation:"+x[4]+"\n"+"salary:"+x[5]+"\n"+"address:"+x[6]+"\n"+"phoneno:"+x[7]);
                                }
                            }
                            br.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
