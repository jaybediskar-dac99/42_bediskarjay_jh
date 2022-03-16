import java.util.Scanner;
class circle
{
  /*Scanner sc = new Scanner(System.in);*/
  
    double area(double r)
   {
   double a =( (22.0/7) *r *r );
   return a;
   }
   
   public static void main(String [] args)
   {
    circle c1=new circle();
Scanner sc=new Scanner(System.in);
 double r=sc.nextDouble();
	double b=c1.area(r);
	System.out.println(b);
   }
} 

