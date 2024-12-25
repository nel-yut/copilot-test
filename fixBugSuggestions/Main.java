package fixBugSuggestions;

import java.util.Scanner;

// 数字以外が入力できてしまう
// ctrl + i でGitHub Copilotのインラインチャットを起動
// その後、「/fix 数字以外が入力できてしまう」 と入力すると、数字以外が入力された場合の処理を提案してくれる
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);
        scanner.close();
    }
}