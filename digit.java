public class digit 
{
 public static void main(String... args)
 {
   String str1 = "welcome4s";
   for(int i=0; i<str1.length();i++)
   {
      Boolean flag = str1.substring(0, 1).matches("[0-9]");
      if(flag)
      {
         System.out.println("First Character is a number..!");
       }
       else
       {
           System.out.println("First character is not a number..!");
        }
 
     }
  }
 }
