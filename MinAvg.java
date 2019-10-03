import java.util.Scanner;
public class MinAvg
{
   public static void main(String[] args)
   {
      Scanner kbd = new Scanner(System.in);
      
      int total = 0;
      int min = 5000;
      
      for(int i = 0; i <= 5; i++)
      {
         System.out.print("Enter score: ");
         int score = kbd.nextInt();
         total += score;
         
         if (score < min )
         {
            min= score;
         }
      }
      double arg= (double)total/5;
      System.out.printf("the class average is %.2f", arg);
      System.out.println();
      System.out.println("The min is: " + min );
    
      
   
   }
}