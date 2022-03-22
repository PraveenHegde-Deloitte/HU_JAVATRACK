import java.io.IOException;
import java.util.*;
public class user_data {
    Scanner sc= new Scanner(System.in);
    public void user_data() throws IOException {
        while (true)
        {
            System.out.println("****Welcome to user Database****");
            System.out.println("1.Add User Data \n2.List User Data\n3.Update User Data\n4.Delete User Data\n5.Exit");
            int i=sc.nextInt();
            switch (i)
            {
                case 1: System.out.println("Add user data");
                    adduser op = new adduser();
                    op.user();
                case 2: System.out.println("Enter UserID to view data");
                listusers ll = new listusers();
                ll.listusers();
                case 3: System.out.println("update the list");
                updatelist ul =new updatelist();
                ul.updatelist();
                case 4:
                    System.out.println("Enter userID to delete data");
                    deleteusers dl =new deleteusers();
                    dl.deleteusers();
                case 5:
                    System.exit(0);
            }
        }
    }
}