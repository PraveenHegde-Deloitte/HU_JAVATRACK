import java.util.Scanner;
public class miniassignment2array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i,j,k;
        int count=0,sum=0;
        for(i=1;i<n;i++)
        {
            if(arr[i]<0)
                count++;
        }
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i+1;j++){
                for(k=0;k<i;k++){
                    sum+=arr[k+j-1];
                }
                if(sum<0)
                    count++;
                sum=0;
            }
        }
        System.out.println(count);
    }
}