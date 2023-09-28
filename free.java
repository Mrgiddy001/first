import java.util.Scanner;

public class free {
    public static void main(String[] agrs){
        int rows;
        int columns;
       String symbol;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number of Columns: ");
        columns = scanner.nextInt();
        System.out.print("Enter the Number of Rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the Symbol: ");
        symbol = scanner.next();
        
        for(int i=1;i<=rows;i++){
            System.out.println();
            for(int j=1;j<=columns;j++){
                System.out.print(symbol);
            }
        }
    }
}
