package Group4;

import Group0.MujunHantei;

public class Hantei {
    public static boolean oyaHantei(int oyaNum) {
        boolean oya;
        oya = false;
        if (oyaNum == 0) {
            oya = false;
        } else if (oyaNum == 1) {
            oya = true;
        } else {
            Group0.MujunHantei.Out();
        }
        return oya;
    }

    public static int kiriage(int num, int keta) {
        double hen;
        keta = (int) (Math.pow(10, keta - 1));
        hen = (double) num;
        hen /= keta;
        return (int) Math.ceil(hen) * keta;
    }

    public static int kiriage(double num, int keta) {
        keta = (int) (Math.pow(10, keta - 1));
        num /= keta;
        return (int) Math.ceil(num) * keta;
    }

    public static void mujunHantei(int fan, int huten) {

        // 翻の矛盾
        if (fan <= 0) {
            MujunHantei.Out();
        }

        // 符点の矛盾
        if ((huten < 20) || !(huten % 10 == 0) || (huten > 110)) {
            if (huten == 25) {
                return;
            }
            MujunHantei.Out();
        }

        // 組み合わせの矛盾
        if ((huten == 20) && (fan == 1) || (huten == 25) || (fan == 1)) {
            MujunHantei.Out();
        }
    }

    public static boolean overHantei(int fan, int huten) { // 満貫未満 true 満貫以上 false
        if (fan >= 5) {
            return false;
        } else if ((fan == 4) && (huten >= 40)) {
            return false;
        } else if ((fan == 3) && (huten >= 70)) {
            return false;
        }
        return true;
    }

    public static boolean overHantei(int fan) { // 満貫未満 true 満貫以上 false
        if (fan >= 5) {
            return false;
        }
        return true;
    }

    public static boolean manganHantei(int fan, int huten) {
        if (fan > 5) {
            return false;
        } else if (fan == 5) {
            return true;
        } else if ((fan == 4) && (huten >= 40)) {
            return true;
        } else if ((fan == 3) && (huten >= 70)) {
            return true;
        }
        return false;
    }

    public static int zettaichi(int num) {
        if (num < 0) {
            return num * -1;
        }
        return num;
    }

}
