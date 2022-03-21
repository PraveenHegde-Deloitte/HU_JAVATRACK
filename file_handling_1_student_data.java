import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class file_handling_1_student_data
{
    public static void main(String[] args) throws FileNotFoundException{
        String l = "";
        String splitBy = ",";
        int i=0;
        boolean check;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        try {
            BufferedReader h = new BufferedReader(new FileReader("StudentData.csv"));
            while ((l= h.readLine()) != null) {
                String[] Rank = l.split(splitBy);
                if(!(Rank[4].contains("Rank")))
                {
                    int r= Integer.parseInt(Rank[4]);
                    arr.add(r);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(arr);
        File stu =new File("s2.csv");
        PrintWriter out=new PrintWriter(stu);
        try {
            out.printf("%s,%s,%s,%s,%s\n", "Name", "10th", "12th","Btech","Rank");
            for(i=0;i<5;i++) {
                BufferedReader h = new BufferedReader(new FileReader("StudentData.csv"));
                check=false;
                while ((l = h.readLine()) != null && check==false) {
                    String[] Rank = l.split(splitBy);
                    if (!(Rank[4].contains("Rank"))) {
                        int r = Integer.parseInt(Rank[4]);
                        if (r == arr.get(i) && i < 5) {
                            out.printf("%s,%s,%s,%s,%S\n", Rank[0], Rank[1], Rank[2], Rank[3], Rank[4]);
                            check=true;
                        }
                    }
                }
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}