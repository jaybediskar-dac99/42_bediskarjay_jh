import java.util.Scanner;
class q12
{
  public static void main(String [] args)
  { 
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter 3 Numbers");
   int x = sc.nextInt();
   int y = sc.nextInt();
   int z = sc.nextInt();
   float ave=((x+y+z)/3);
		System.out.println("Avarage ="+ave);
  }
}