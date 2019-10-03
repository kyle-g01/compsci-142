import java.util.Scanner;


public class Max3
{
    public static void main(String[] args) {
        int[] list = new int[10];
        Scanner R = new Scanner(System.in);
        
        System.out.println("Enter int #1:");
        list[0] = R.nextInt();
        System.out.println("Enter int #2:");
        list[1] = R.nextInt();
        System.out.println("Enter int #3:");
        list[2] = R.nextInt();
        System.out.println("Enter int #4:");
        list[3] = R.nextInt();
        System.out.println("Enter int #5:");
        list[4] = R.nextInt();
        System.out.println("Enter int #6:");
        list[5] = R.nextInt();
        System.out.println("Enter int #7:");
        list[6] = R.nextInt();
        System.out.println("Enter int #8:");
        list[7] = R.nextInt();
        System.out.println("Enter int #9:");
        list[8] = R.nextInt();
        System.out.println("Enter int #10:");
        list[9] = R.nextInt();
        
        R.close();
        
        for (int i = 0; i <= 9; i++){
            for (int j = 0; j <=8; j++){
                if (list[j] > list [j + 1]){
                    
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        String max3 = "";

        for (int i = 7; i <= 9; i++){
            int value = list[i];
            max3 += value + " ";
        }

        System.out.println("Top 3 Values: " + max3);
    }
}