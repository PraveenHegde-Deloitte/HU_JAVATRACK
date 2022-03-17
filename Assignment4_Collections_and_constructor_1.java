import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Assignment4_Collections_and_constructor_1
{
    public static void main(String[] args)
    {
        int i;
        ArrayList mylist = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] a = str.split(" ");
        for(i=0;i<a.length;i++)
        {
            mylist.add(a[i]);
        }
        System.out.println("List =" + mylist);
        Collections.reverse(mylist);
        System.out.println("reverse list =" + mylist);
    }
}
