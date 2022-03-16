class cmdl1

{
   public static void main(String args[])
   {
     String s1=args[0];
	 String s2=args[1];
	 String s3=args[2];
	 
	 int i=Integer.parseInt(s1);//wrapper class
	 int j=Integer.parseInt(s2);
	 int k=Integer.parseInt(s3);
	 
	 //int sum=(s1+s2+s3);
	 System.out.println("SUM ="+(i+j+k));
   }
}
