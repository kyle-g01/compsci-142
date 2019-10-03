import java.util.Scanner;

public class Sum
{
    public static void main(String[] args) {
        Scanner R = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int number = R.nextInt();
        
        while (number < 0){
            System.out.println("Please enter a positive integer:");
            number = R.nextInt();
        }
        
        R.close();
        
        String strNumber = String.valueOf(number);
        System.out.println("Number: " + strNumber);
        int sum = 0;
      
        for (int i = 0; i < strNumber.length(); i++){
            char num = strNumber.charAt(i);
            int value = Character.getNumericValue(num);
            System.out.println("Character: " + value);
            
            sum = sum + value; 
        }

        System.out.println("Sum = " + sum);
    }
}