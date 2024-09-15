package Main;

import java.util.Scanner;
import Group0.*;
import Group1.*;
import Group2.*;
import Group3.*;
import Group4.*;

public class Access {
    public static void bunki(String choNum) {
        int y = 0;
        int m = 0;
        int fan = 0;
        int futen = 0;
        int oyaNum = 0;
        int i = 0;
        int yakumanHanteiSu = 0;
        String wareki = null;
        String[] yakumei = new String[100];
        boolean oya = false;
        boolean yakumanHantei = false;
        Scanner sc = new Scanner(System.in);

        switch (choNum) {
            case "000":
                System.out.println("ありがとうございました");
                System.exit(0);
                break;
            case "001":
                System.out.println("---西暦から月カレンダー---");
                System.out.print("西暦を入力してください>>");
                y = sc.nextInt();
                System.out.print("月を入力してください>>");
                m = sc.nextInt();
                Print.printMonth(y, m, choNum);
                break;
            case "002":
                System.out.println("---西暦から年カレンダー---");
                System.out.print("西暦を入力してください>>");
                y = sc.nextInt();
                Print.printYear(y, choNum);
                break;
            case "011":
                System.out.println("---和暦から月カレンダー---");
                System.out.print("和暦だけを入力してください>>");
                wareki = sc.next();
                System.out.print("年を入力してください>>");
                y = sc.nextInt();
                System.out.print("月を入力してください>>");
                m = sc.nextInt();
                Print.printMonth(Year.WarekiSeireki(wareki, y), m, choNum);
                break;
            case "012":
                System.out.println("---和暦から年カレンダー---");
                System.out.print("和暦だけを入力してください>>");
                wareki = sc.next();
                System.out.print("年を入力してください>>");
                y = sc.nextInt();
                Print.printYear(Year.WarekiSeireki(wareki, y), choNum);
                break;
            case "101":
                System.out.println("---九九の表---");
                int[] a = new int[3];
                System.out.println("３つの段を出力します");
                for (int j = 0; j < 3; j++) {
                    System.out.print("段>>");
                    a[j] = sc.nextInt();
                }
                Kuku.kake(a);
                Choice.choice(choNum);
                break;
            case "102":
                String wa;
                int waYear;
                System.out.println("---和暦から西暦に変換---");
                System.out.print("和暦だけ入力してください>>");
                wa = sc.next();
                System.out.print("年を入力してください>>");
                waYear = sc.nextInt();
                Henkan.WtoS(wa, waYear);
                Choice.choice(choNum);
                break;
            case "103":
                int seireki;
                System.out.println("---西暦から和暦に変換---");
                System.out.print("西暦を入力してください>>");
                seireki = sc.nextInt();
                Henkan.StoW(seireki);
                Choice.choice(choNum);
                break;
            case "104":
                System.out.println("---最小枚数の硬貨---");
                int kingaku;
                System.out.print("金額を入力してください>>");
                kingaku = sc.nextInt();
                Kouka.main(kingaku);
                Choice.choice(choNum);
                break;
            case "105":
                System.out.println("---2次方程式の解---");
                double d, b, c;
                System.out.println("方程式 ax^2 + bx + c = 0 の a b c を入力してください");
                System.out.print("a = ");
                d = sc.nextDouble();
                System.out.print("b = ");
                b = sc.nextDouble();
                System.out.print("c = ");
                c = sc.nextDouble();
                Nijihotesiki.main(d, b, c);
                Choice.choice(choNum);
                break;
            case "106":
                System.out.println("---生まれて何日か---");
                int[] toshi = new int[2];
                int[] tsuki = new int[2];
                int[] hi = new int[2];
                System.out.print("西暦？>> ");
                toshi[0] = sc.nextInt();
                System.out.print("何月？>> ");
                tsuki[0] = sc.nextInt();
                System.out.print("何日？>> ");
                hi[0] = sc.nextInt();
                System.out.print("今日の西暦は？>> ");
                toshi[1] = sc.nextInt();
                System.out.print("今日の月は？>> ");
                tsuki[1] = sc.nextInt();
                System.out.print("今日の日は？>> ");
                hi[1] = sc.nextInt();
                Born.main(toshi, tsuki, hi);
                Choice.choice(choNum);
                break;
            case "107":
                System.out.println("---引き算大好き---");
                Hikizan.hikizan();
                break;
            case "201":
                System.out.println("---ハロメンルーレット---");
                Shuffle.shuffle();
                break;
            case "302":
                System.out.println("---確率シミュレータ---");
                System.out.print("1/??? >> ");
                int bunbo = sc.nextInt();
                Kakuritsu.kaku(bunbo);
                Choice.choice(choNum);
                break;
            case "401":
                System.out.println("---麻雀翻と符点の数で計算---");
                System.out.print("何翻>>");
                fan = sc.nextInt();
                if (Hantei.overHantei(fan)) {
                    System.out.print("何符 >>");
                    futen = sc.nextInt();
                } else if (!(Hantei.overHantei(fan))) {
                    futen = 20;
                }
                System.out.print("親ですか？(Yes>>1,No>>0) >>");
                oyaNum = sc.nextInt();
                oya = Hantei.oyaHantei(oyaNum);
                boolean yakuman = false;
                Tensu.tensuKeisanPrint(fan, futen, oya, choNum, yakuman);
                Choice.choice(choNum);
                break;
            case "402":
                System.out.println("---役の名前から翻数---");
                System.out.print("役満ですか？（数え役満は除く Yes>>1,No>>0）>>");
                yakumanHanteiSu = sc.nextInt();
                yakumanHantei = Hantei.oyaHantei(yakumanHanteiSu);
                System.out.println("~~役の名前を入力してください (breakで入力完了です)~~");
                yakumei = new String[100];
                i = 0;
                do {
                    yakumei[i] = sc.next();
                    i++;
                } while (!(yakumei[i - 1].equals("break")));
                Fan.fanSuPrint(Fan.fanNameToFan(yakumei, yakumanHantei), yakumanHantei);
                Choice.choice(choNum);
                break;
            case "403":
                System.out.println("---符点だけ計算---");
                System.out.println(Futen.futenSimulator() + "符です");
                Choice.choice(choNum);
                break;
            case "404":
                System.out.println("---役の名前と符点シミュから点数---");

                /*
                 * まず翻を数えますよ。
                 * 役の名前から翻を計算するにはFanクラスのfanNameToFanを用います。
                 * 引数は yakumei[] と yakumanhantei
                 * 返り値はint型で翻数です。役満（数え役満は除く）の場合は負の値となり、|n|倍役満となります。
                 */

                System.out.print("役満ですか？（数え役満は除く Yes>>1,No>>0）>>");
                yakumanHanteiSu = sc.nextInt();
                yakumanHantei = Hantei.oyaHantei(yakumanHanteiSu);
                System.out.println("~~役の名前を入力してください (breakで入力完了です)~~");
                i = 0;
                do {
                    yakumei[i] = sc.next();
                    i++;
                } while (!(yakumei[i - 1].equals("break")));
                fan = Fan.fanNameToFan(yakumei, yakumanHantei);

                /*
                 * お次は符点を数えますよ。
                 * FutenクラスのfutenSimulatorがやってくれます。
                 * 引数はなく（全部あっちでやるから）、返り値はint型、符点ですね。
                 */

                futen = Futen.futenSimulator();

                // ぶちこみます。
                System.out.print("親ですか？(Yes>>1,No>>0) >>");
                oyaNum = sc.nextInt();
                oya = Hantei.oyaHantei(oyaNum);
                if (yakumanHantei) {
                    System.out.println(Hantei.zettaichi(fan) + "倍役満" + "は>>\t");
                } else {
                    System.out.println(fan + "翻" + futen + "符は>>\t");
                }
                Tensu.tensuKeisanPrint(fan, futen, oya, choNum, yakumanHantei);
                Choice.choice(choNum);
                break;
            case "405":
                System.out.println("---理牌---");
                System.out.println("~~牌を入力してください(14コ)~~");
                String[] okuruHai = new String[14];
                for (int p = 0; p < 14; p++) {
                    System.out.print("\t>>");
                    okuruHai[p] = sc.next();
                }
                okuruHai = Ripai.ripai(okuruHai);
                for (int p = 0; p < 14; p++) {
                    System.out.println(okuruHai[p]);
                }
                Choice.choice(choNum);
                break;
            default:
                MujunHantei.Out();
        }
        sc.close();
    }
}
