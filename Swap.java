import java.util.Scanner;
public class Swap
{
   public static void main(String[] args) 
   {
      int[] list = new int[25];
      Scanner R = new Scanner(System.in);
      
                  

      int MaxValue = -999;
      int MinValue = 999;
      int MaxPosition = 0;
      int MinPosition = 0;
      
      for(int i = 0 ; i < list.length; i++)
      {
         System.out.println("Enter Int #" + (i+ 1));
         list[i] = R.nextInt();
         
      }

      
      for (int CurrentPosition = 0; CurrentPosition <= 25; CurrentPosition++)
      {
         int currentValue = list[CurrentPosition];
         if(currentValue > MaxValue)
         {
            MaxValue = currentValue;
            MaxPosition = CurrentPosition;
         }
         if(currentValue < MinValue)
         {
            MinValue = currentValue;
            MinPosition = CurrentPosition;
         }
      }
      
            
      list [MaxPosition] = MinValue;
      list [MinPosition] = MaxValue;      
   }
}
