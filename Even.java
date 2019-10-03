import java.util.Scanner;
public class Even
{
   public static void main(String[] args) 
   {
      int[] list = new int[25];
      Scanner R = new Scanner(System.in);
      
      for(int i = 0 ; i < list.length; i++)
      {
         System.out.println("Enter Int #" + (i+ 1));
         list[i] = R.nextInt();
         
      }
      int even = 0;
   
      for (int i = 0; i <list.length; i++)
      {
         if ( list[i] % 2 == 0 )
         {
            
            even++;
         }        
      }
      System.out.println( even);
 
      System.out.println( even % 2 == 0);
   
   }
}