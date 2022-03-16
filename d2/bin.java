import java.util.Scanner;
class bin
{
  public static void main(String [] args)
  {
	  String j="";
	  char rev;
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  String bin="";
  while(n>0)
  {
    int r = n%2;
	bin=bin+r;
	n=n/2;
  }
  for(int i=0;i<bin.length();i++)
  {
	  rev=bin.charAt(i);
	   j=rev+j;
  }
    System.out.println(j);
  }
}