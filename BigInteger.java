import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger n=sc.nextBigInteger();
        BigInteger no=sc.nextBigInteger();
        System.out.println(n.add(no));
        System.out.println(n.multiply(no));
    }
}