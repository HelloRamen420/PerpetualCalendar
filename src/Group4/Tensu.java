package Group4;

public class Tensu {
    public static double baseTensuKeisan(int fan, int huten, boolean oya, String choNum) {
        double tensu = 0;
        if (fan < 0) {
            fan = Math.abs(fan);
            tensu = fan * 32000;
        } else {
            Hantei.mujunHantei(fan, huten);
            if (Hantei.overHantei(fan, huten)) {// 満貫以下
                tensu = Math.pow(2, (2 + fan)) * huten;
                if (oya) {// 満貫以下はbaseの点数なのでここで６倍して返しておく
                    tensu = tensu * 6;
                }
                return tensu;
            } else if (Hantei.manganHantei(fan, huten)) {// 満貫
                tensu = 8000;
            }

            else {// それ以上
                switch (fan) {
                    case 6:
                    case 7:
                        tensu = 12000;
                        break;
                    case 8:
                    case 9:
                    case 10:
                        tensu = 16000;
                        break;
                    case 11:
                    case 12:
                        tensu = 24000;
                        break;
                    default:
                        if (fan >= 13) {
                            tensu = 32000;
                        } else {
                            System.out.println("なんかミスってます");
                            Main.Choice.choice(choNum);
                        }
                        break;
                }
            }
        }
        if (oya) {
            tensu = tensu * 1.5;
        }
        return tensu;
    }

    public static void tensuKeisanPrint(int fan, int huten, boolean oya, String choNum, boolean YakuHantei) {
        double tensu = baseTensuKeisan(fan, huten, oya, choNum);
        int ten;
        if (YakuHantei) {
            if (oya) {
                System.out.println(Hantei.zettaichi(fan) * 48000 + "点(" + Hantei.zettaichi(fan) * 48000 / 3 + ")");
                return;
            } else {
                System.out.println(Hantei.zettaichi(fan) * 32000 + "点(" + Hantei.zettaichi(fan) * 32000 / 2 + "/"
                        + Hantei.zettaichi(fan) * 32000 / 4 + ")");
                return;
            }
        }
        if (oya) {
            if (!(Hantei.overHantei(fan, huten))) {// 満貫以上はベースの点数でないため
                ten = (int) tensu;
                System.out.println(ten + "点(" + ten / 3 + ")");
                return;
            }
            System.out.println(Hantei.kiriage(tensu, 3) + "点(" + Hantei.kiriage(tensu / 3, 3) + ")");
        } else {
            if (!(Hantei.overHantei(fan, huten))) {// 満貫以上はベースの点数でないため
                ten = (int) tensu;
                System.out.println(ten + "点(" + ten / 2 + "/" + ten / 4 + ")");
                return;
            }
            System.out.println(Hantei.kiriage(tensu * 4, 3) + "点(" + Hantei.kiriage(tensu * 2, 3) + "/"
                    + Hantei.kiriage(tensu * 1, 3) + ")");
        }
    }

}
