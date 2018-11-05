import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] b = new int[9];
        for (int i = 0; i < n; i++) b[in.nextInt()-1]++;
        int max = 0;
        int id = 0;
        for (int i = 0; i < 9; i++) {
            if (b[i] > 1) {
                id = i+1;
               System.out.println(id);
            }
        }
        
    }
}