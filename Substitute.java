import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int firstNumber = k; firstNumber <= 8; firstNumber++) {
            for (int secondNumber = 9; secondNumber >= l; secondNumber--) {
                for (int thirtNumber = m; thirtNumber <= 8; thirtNumber++) {
                    for (int forthNumber = 9; forthNumber >= n; forthNumber--) {
                       if (firstNumber % 2 == 0 && secondNumber % 2 == 1 && thirtNumber % 2 == 0 && forthNumber % 2 ==1){
                           if (count == 6){
                               break;
                           }
                           if (firstNumber == thirtNumber && secondNumber == forthNumber) {
                               System.out.println("Cannot change the same player.");
                           } else {
                               count++;
                               System.out.printf("%s%s - %s%s%n",firstNumber,secondNumber,thirtNumber,forthNumber);
                           }
                       }
                    }
                }
            }
        }
    }
}