class cg
{
  public static void main(String args[])
  {
     int n;
 
     n=args.length;
 
     double mrks[]=new double[n];
 
     double grde[]=new double[n];
 
     double cgpa,sum=0;
 
     for(int i=0;i<n;i++)
     {
       mrks[i]=Long.parseLong(args[i]);
     }
 
     for(int i=0;i<n;i++)
     {
       grde[i]=(mrks[i]/10) ;
     }
 
     for(int i=0;i<n;i++)
     {
       sum+=grde[i];
     }
 
      cgpa=sum/n;
 
      System.out.println("cgpa="+cgpa);
 
      System.out.println("percantage from cgpa="+cgpa*9.5);
 
   }
}
