import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int diagonal1=0,diagonal2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int num=sc.nextInt();
                if(i==j){
                    diagonal1=diagonal1+num;
                }
                if(j+i==n-1){
                    diagonal2=diagonal2+num;
                }
            }
        }
        System.out.println(Math.abs(diagonal2-diagonal1));
    }
}