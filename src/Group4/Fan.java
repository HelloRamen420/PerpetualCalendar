package Group4;

public class Fan {
    public static String yaku[] = { "ドラ", "門前清自摸和", "立直", "一発", "断么九", "三元牌", "自風牌", "場風牌", "平和", "一盃口", "海底摸月", "河底撈魚",
            "嶺上開花", "槍槓", "ダブル立直", "三色同順", "三色同刻", "三暗刻", "一気通貫", "七対子", "対々和", "混全帯么九", "三槓子", "小三元", "混老頭", "二盃口",
            "純全帯么九", "混一色", "清一色", "四暗刻", "大三元", "国士無双", "緑一色", "字一色", "清老頭", "小四喜", "九蓮宝燈", "地和", "天和", "大四喜", "四槓子",
            "四暗刻単騎待ち", "国士無双13面待ち", "純正九蓮宝燈" };
    public static int fanSu[] = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 6,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2 };

    public static void main(String[] args) {
    }

    public static int fanNameToFan(String[] fan, boolean yakumanHantei) {
        int gokei = 0;
        int i = 0;// 入力した翻
        int j = 0;// 用意している翻

        while (!(fan[i].equals("break"))) {
            if (j == 44) {
                i++;
                j = 0;
                continue;
            }
            if (fan[i].equals(yaku[j])) {
                if (yakumanHantei) {
                    gokei += fanSu[j];
                    i++;
                    j = 0;
                    continue;
                } else if (!yakumanHantei) {
                    gokei += fanSu[j];
                    i++;
                    j = 0;
                    continue;
                }
            }
            j++;
        }
        return gokei;
    }

    public static void fanSuPrint(int fan, boolean yakumanHantei) {
        if (yakumanHantei) {
            System.out.println(Hantei.zettaichi(fan) + "倍役満です");
        } else {
            System.out.println(fan + "翻です");
        }
    }
}
