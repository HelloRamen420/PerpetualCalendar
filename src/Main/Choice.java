package Main;

import java.util.Scanner;
import Group2.*;
import Group0.Print;

public class Choice {

    public static void choice(String choNum) {
        String jikko;
        System.out.print("次の実行>>");
        Scanner sc = new Scanner(System.in);
        jikko = sc.next();

        switch (jikko) {
            case "rep":
                Access.bunki(choNum);
                break;
            case "home":
                Main.main(null);
                break;
            case "exit":
                System.out.println("ありがとうございました");
                sc.close();
                System.exit(0);
                break;
            default:
                System.out.println("ミスがあります。やり直しです。");
                choice(choNum);
                break;
        }
    }

    public static void choice(int y, int m, String choNum) {
        String jikko;
        System.out.print("次の実行>>");
        Scanner sc = new Scanner(System.in);
        jikko = sc.next();

        switch (jikko) {
            case "neM":
                if (m == 12) {
                    Print.printMonth(y + 1, 1, choNum);
                } else {
                    Print.printMonth(y, m + 1, choNum);
                }
                break;
            case "neY":
                if (choNum.equals("001") || choNum.equals("011")) {
                    Print.printMonth(y + 1, m, choNum);
                } else {
                    Print.printYear(y + 1, choNum);
                }
                break;
            case "prM":
                if (m == 1) {
                    Print.printMonth(y - 1, 12, choNum);
                } else {
                    Print.printMonth(y, m - 1, choNum);
                }
                break;
            case "prY":
                Print.printMonth(y - 1, m, choNum);
                break;
            case "rep":
                Access.bunki(choNum);
                break;
            case "home":
                Main.main(null);
                break;
            case "exit":
                System.out.println("ありがとうございました");
                sc.close();
                System.exit(0);
                break;
            default:
                System.out.println("ミスがあります。やり直しです。");
                choice(y, m, choNum);
                break;
        }
    }

    public static void choice(String[] hako, int kaisu, String choNum, boolean chohuku) {
        String jikko;
        System.out.print("次の実行>>");
        Scanner sc = new Scanner(System.in);
        jikko = sc.next();

        switch (jikko) {
            case "aga":
                Shuffle.memPrint(hako, kaisu, chohuku);
                break;
            case "add":
                Shuffle.memPrint(hako, kaisu + 1, chohuku);
                break;
            case "sub":
                Shuffle.memPrint(hako, kaisu - 1, chohuku);
                break;
            case "cha":
                System.out.print("\n何人出しますか？\t>>");
                kaisu = sc.nextInt();
                Shuffle.memPrint(hako, kaisu, chohuku);
                break;
            case "rep":
                Access.bunki(choNum);
                break;
            case "home":
                Main.main(null);
                break;
            case "exit":
                System.out.println("ありがとうございました");
                sc.close();
                System.exit(0);
                break;
            default:
                System.out.println("ミスがあります。やり直しです。");
                choice(hako, kaisu, choNum, chohuku);
                break;
        }
    }
}
