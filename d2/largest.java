import java.util.Scanner;


class largest

{
    public static void main(String [] args)
  {
    System.out.println("Enter three numbers");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
	
    if(a==b&&b==c&&a==c)
    System.out.println("All are equal");
	
    else if ( a>=b && a>=c)
	System.out.println("1st number is largest");
	
	else if ( b>=a && b>=c )
	System.out.println("2nd number is largest");
	
	else
	System.out.println("3rd number is largest");
 
   }
}