public class sumlasm 
{
public static void main(String[] args) 
{
int numb[] = new int[]{32,43,53,54,32,65,63,98,43,23};
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
