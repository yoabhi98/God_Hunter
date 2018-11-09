import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution10 {

    public static void main(String[] args) 
	{
	int i,j,k,sum=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
 	int m = in.nextInt();
        int[] b = new int[n];
	 int[] c = new int[m];

        for ( i = 0; i < n; i++) 
	b[i]=in.nextInt();
	for ( i = 0; i < m; i++) 
	c[i]=in.nextInt();
        for (i = 0; i < n; i++)
	{
	 for (j = 0; j < m; j++)
	{
           if (c[j]==b[i]) 
		sum=1;          
	}
		}
	if(sum==1)
	System.out.println("YES");
	else
	System.out.println("NO");


		
 	
		
            

    }
}