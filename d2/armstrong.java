
import java.util.Scanner;
class armstrong
{ 
    
	public static void main(String [] args)
	{
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter a number");
	   int n = sc.nextInt();
	   int res;
	   int temp=n;
	   int sum=0;
	   while(n>00)
	   {
	    res = n%10;
        sum=sum+(res*res*res);	
        n=n/10;		
	   }
	   if(temp==sum)
	   System.out.println("Armstrong Number");
	   else
	   System.out.println("Normal number");
	}
   
 }