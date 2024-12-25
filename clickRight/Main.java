package clickRight;

import java.util.Scanner;
import java.util.InputMismatchException;

// ソースコードを選択して右クリック > Copilotでいろいろできる
// 「説明」/explainと同等
// 「修正」/fixと同等
// 「レビューとコメント」レビューしてくれる
// 「ドキュメントを生成する」/docと同等
// 「テストを生成する」/testsと同等
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