package createTestCode;

import java.util.Scanner;
import java.util.InputMismatchException;

// テストコードを作成する
// ctrl + i でGitHub Copilotのインラインチャットを起動
// その後、「/tests」 と入力すると、テストコードを作成してくれる
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try {
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        scanner.close();
    }
}