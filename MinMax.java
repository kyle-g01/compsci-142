import java.util.Scanner;
public class MinMax
{
   public static void main(String[] args) 
   {
      int[] list = new int[25];
      Scanner R = new Scanner(System.in);
      
   
      
     
      
      int Max = 0;
      int Min = 1000;
      
     for(int i = 0 ; i < list.length; i++)
      {
         System.out.println("Enter Int #" + (i+ 1));
         list[i] = R.nextInt();
         
      }

      
      for (int i = 0; i <=list.lengt; i++)
      {
         int current = list[i];
         if(current > Max)
         {
            Max = current;
         }
         if(current < Min)
         {
            Min = current;
         }
      }
      
      System.out.println("Your Max number is " + Max);
      System.out.println("Your Min number is " + Min);
      
      
      
   }
}
