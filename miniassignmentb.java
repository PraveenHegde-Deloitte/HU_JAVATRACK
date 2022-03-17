import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class miniassignmentb {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str1,str2,str3;
        str1=sc.nextLine();
        str2=sc.nextLine();
        str3=sc.nextLine();
        if(isShuffle(str1,str2,str3))
            System.out.println("valid");
        else
            System.out.println("invalid");
    }
    public static boolean isShuffle(String str1, String str2, String str3) {
        if (str1.length() + str2.length() != str3.length())
            return false;
        int a, b, c;
        a = b = c = 0;
        while (c < str3.length()) {
            if (a < str1.length() && str3.charAt(c) == str1.charAt(a))
                a++;
            else if (b < str2.length() && str3.charAt(c) == str2.charAt(b))
                b++;
            else
                return false;
            c++;
        }
        return true;
    }
}
