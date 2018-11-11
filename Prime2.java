import java.util.*;
public class Prime2
{

     
public static void main(String []args)
{
               
Scanner sc=new Scanner(System.in);

int result=0;
int a = sc.nextInt();
int b = sc.nextInt();
for(++a;a<b;a++)
{
if(a%2==0)
result++;
}
System.out.println(result);     
}
}