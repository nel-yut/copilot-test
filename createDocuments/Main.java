package createDocuments;

import java.util.Scanner;
import java.util.InputMismatchException;

// テストコードを作成する
// 行を選択のあと、ctrl + i でGitHub Copilotのインラインチャットを起動
// その後、「/doc」 と入力すると、ドキュメントを作成してくれる
// 日本語でのコメントも問題なく生成される
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