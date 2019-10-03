import java.util.Scanner;

public class PrintGrid
{
    public static void main(String[] args) {
        Scanner R = new Scanner(System.in);
        System.out.println("Enter # Rows:");
        int rows = R.nextInt();
        System.out.println("Enter # Columns:");
        int columns = R.nextInt();
        R.close();
           
        String rowText = "";
        int cellValue = 0;

        for (int i = 1; i < rows + 1; i++){
            for (int j = i; j < columns + i; j++){
                if (j == i){
                    cellValue = i;
                }
                else {
                    cellValue += rows;
                }
                
                rowText += cellValue + ",";
            }
            
            System.out.println(rowText.substring(0, rowText.length() - 1));
            cellValue = 0;
            rowText = "";

        }

       
        //System.out.println(line.substring(0, line.length() - 3) + " = " + value);
    }
}