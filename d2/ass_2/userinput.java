
import java.util.Scanner;
// input ,name,mobile,city,gender
class userinput
{
  public static void main(String args[] )
  {
    Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter name-");
	String name=sc.nextLine();
	
	System.out.println("Enter mobile");
	String num=sc.nextLine();
	
	System.out.println("Enter city-");
	String city=sc.nextLine();
	
	
	System.out.println("Enter gender-");
	String gender=sc.nextLine();
	
	System.out.println("Name="+name);
	System.out.println("Mobile="+num);
	System.out.println("city="+city);
	System.out.println("gender="+gender);
  }
}