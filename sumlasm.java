public class sumlasm 
{
public static void main(String[] args) 
{
int numb[] = new int[]{19,7,12};
int small = numb[0];
int large = numb[0];
for(int i=1; i< numb.length; i++)
{
 if(numb[i] > large)
 large = numb[i];
 else if (numb[i] < small)
 small = numb[i];
 }
 sum=small+large;
 System.out.println("Sum of minimal and maximal number is : " + sum);
}
