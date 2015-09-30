import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int no[]=new int[n];
        for(int i=0;i<n;i++){
            no[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i;j<n;j++){
                s=s+no[j];
                if(s<0){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}