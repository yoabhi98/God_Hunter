import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution9 {

    public static void main(String[] args) 
	{
	int i,j,k,sum=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] b = new int[n];
        for ( i = 0; i < n; i++) 
	b[i]=in.nextInt();
        for (i = 0; i < n; i++)
	{
	 for (j = i+1; j < n; j++)
	{
                if (b[i]+b[j]==0)           
                   System.out.println(b[i]+" "+b[j]);

	
		}
			}
		
 	
		
            

    }
}