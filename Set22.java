import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Set22 {

    public static void main(String[] args) {
int i;
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
	int k=in.nextInt();
	int [] arr=new int[n];
	for(i=0;i<n;i++)
	{
	arr[i]=in.nextInt();
	}
	int max=arr[0];
	for(i=0;i<n;i++)
	{
	if(arr[i]>max)
	max=arr[i];
	}
	int flag=0;
	for(i=0;i<n;i++)
	{
	if(arr[i]>=max)
	flag++;
	max--;
	if(flag==k)
	{
	System.out.println(arr[i]);
	break;
	}}
	
        
    }
}