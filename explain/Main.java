package explain;

import java.util.Scanner;
import java.util.InputMismatchException;

// テストコードを作成する
// 行を選択のあと、ctrl + i でGitHub Copilotのインラインチャットを起動
// その後、「/explain」 と入力すると、説明してくれる
// VSCodeの場合、説明する範囲を選択できる
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