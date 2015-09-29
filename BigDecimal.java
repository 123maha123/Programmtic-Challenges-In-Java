import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []argh)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }      
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                double a=Double.parseDouble(s[i]);
                double b=Double.parseDouble(s[j]);
                if(a<=b){
                    String temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}