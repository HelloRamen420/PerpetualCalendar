package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choNum;

        System.out.println("ようこそ万年カレンダーへ！");
        System.out.print("選択してください>>");
        choNum = sc.next();
        System.out.println();

        Access.bunki(choNum);

        sc.close();
    }
}
