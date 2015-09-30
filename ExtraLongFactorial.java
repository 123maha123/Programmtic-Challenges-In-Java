import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger f=BigInteger.valueOf(1);
        for(int i=1;i<=n;i++){
            BigInteger no=BigInteger.valueOf(i);
            f=f.multiply(no);
        }
        System.out.println(f);
    }
}