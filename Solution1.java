import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] b = new int[9];
        for (int i = 0; i < n; i++) b[in.nextInt()-1]++;
        int id = 0;
        int flag=0;
        for (int i = 0; i < 9; i++) {
            if (b[i] > 1) {
                id = i+1;
                flag=1;
               System.out.println(id);
            }
        }
if(flag==0)
System.out.println("unique");
        
    }
}