import java.util.Scanner;
class ifhw
{
  public static void main(String [] args)
  {
	Scanner sc= new Scanner(System.in);
    System.out.println("Enter ur marks");
    	
    int marks=sc.nextInt();
	if(marks < 50 )
	{
	  System.out.println("Fail");
	}
	else if(marks>=50 && marks<60)
	{
		System.out.println("Passed with D grade");
	}
	else if(marks>=60 && marks<70)
    {
	  System.out.println("Passed with c grade");
	}
    else if(marks>=70 && marks<80)
	{
	   System.out.println("Passed with B grade");
	}
    else if(marks>=80 && marks<90)
	{
		System.out.println("Passed with A grade");
	}
	else if(marks>=90 && marks<100)
	{
		System.out.println("Passed with A+ grade");
	}
	else 
		System.out.println("Invalid entry`");
	
    }
}