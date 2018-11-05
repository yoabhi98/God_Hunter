import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) 
{
 	int i;
  	String num="";
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
	int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=in.nextInt();
	
for (i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr.length; j++){
	 if (arr[i] > arr[j]) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
	for(i=0;i<n;i++)
	num=num+arr[i];
	System.out.println(num);
}
}