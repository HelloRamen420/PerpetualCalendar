package Group2;

import Main.Choice;
import java.util.Arrays;

public class Master {

    public static void master(String[] hako) {
        System.out.println("\n\n----こんなの作ってました----");
        System.out.print("01 : Juiceオリメン全員出るまで表示スッペシャル\n02 : 人数確認したいマン\n");
        System.out.print("\nどれにしますよ\t>>");
        String num = Shuffle.sc.next();
        switch (num) {
            case "01":
                master01(hako);
                break;
            case "02":
                master02(hako);
            default:
                break;
        }
        Choice.choice(hako, 0, "201", false);
    }

    public static void master01(String[] hako) { // Juiceオリメン全員出るまで表示スッペシャル
        final int JUICEMEN = 5;
        int kaisu = 0;
        String[] kaburu = new String[JUICEMEN];
        boolean juice = false;
        for (int i = 0; i < (Shuffle.name.length + Shuffle.nameOG.length); i++) {
            hako = Shuffle.ireru(i, hako);
        }
        String printMen;
        while (!juice) {
            Arrays.fill(kaburu, null);
            for (int i = 0; i < JUICEMEN; i++) {
                printMen = hako[(int) (Math.random() * Shuffle.nullHantei(hako))];
                if (Shuffle.dabCheck(kaburu, printMen)) {
                    kaburu[i] = printMen;
                } else {
                    i--;
                    continue;
                }
            }
            juice = juiceDab(kaburu);
            kaisu++;
        }
        System.out.println("\n" + "-----------------------------" + "\n");
        for (int i = 0; i < JUICEMEN; i++) {
            System.out.println(kaburu[i] + "\n");
        }
        System.out.println("-----------------------------");
        System.out.println(kaisu + "回かかりました");
    }

    public static boolean juiceDab(String[] kaburu) {
        String[] juiceOri = { "宮崎由加", "金澤朋子", "高木紗友希", "宮本佳林", "植村あかり" };
        int kaisu = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (!kaburu[i].equals(juiceOri[j]))
                    kaisu++;
            }
            if (kaisu == 5) {
                return false;
            }
            kaisu = 0;
        }
        return true;
    }

    public static void master02(String[] hako) { // 人数確認したいマン
        System.out.print("All > 1  現役 > 2  OG > 3\t>>");
        int num = Shuffle.sc.nextInt();
        System.out.print("\n");
        switch (num) {
            case 1:
                for (int i = 0; i < (Shuffle.name.length + Shuffle.nameOG.length); i++) {
                    hako = Shuffle.ireru(i, hako);
                }
                System.out.println(Shuffle.nullHantei(hako) + "人");
                return;
            case 2:
                for (int i = 0; i < Shuffle.name.length; i++) {
                    hako = Shuffle.ireru(i, hako);
                }
                System.out.println(Shuffle.nullHantei(hako) + "人");
                return;
            case 3:
                for (int i = 0; i < Shuffle.nameOG.length; i++) {
                    hako = Shuffle.ireru(i + Shuffle.name.length, hako);
                }
                System.out.println(Shuffle.nullHantei(hako) + "人");
                return;
            default:
                return;
        }
    }
}
