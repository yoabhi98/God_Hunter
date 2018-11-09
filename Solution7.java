import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) 
	b[i]=in.nextInt();
        for (int i = 0; i < n; i++) 
	{
	int id=i;

            if (id%2==0 && b[i]%2!=0)           
               System.out.print(b[i]);
		
 	if (id%2!=0 && b[i]%2==0)          
               System.out.print(b[i]);
		
            
}
    }
}