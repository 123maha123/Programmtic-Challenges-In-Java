import java.io.*;
import java.util.*;

public class Solution {
   static boolean isAnagram(String A, String B) {
       char a[]=A.toCharArray();
       char b[]=B.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
       if(Arrays.equals(a,b)){
           return true;
       }else{
           return false;
       }
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A.toLowerCase(),B.toLowerCase());
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}