import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution3 {

    public static void main(String[] args) {
int i;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] b = new int[n];
        for (i = 0; i < n; i++)
	 b[i]=in.nextInt();
        int id = 0;
        int flag=0;
for (i = 0; i < b.length; i++) {
    for (int j = 0; j < b.length; j++){
	 if (b[i] < b[j]) {
            int temp = b[i];
            b[i] =  b[j];
            b[j] = temp;
        }
    }
}
        for (i = 0; i < n; i++) {
            if (b[i] <= n-1) {
                id = i+1;
                flag=1;
               System.out.println(b[i]);
            }
        }
if(flag==0)
System.out.println("-1");
        
    }
}