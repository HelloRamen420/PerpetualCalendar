package Group2;

import java.util.*;
import Main.Choice;

public class Shuffle {
    public static String[] morningG = { "生田衣梨奈", "石田亜佑美", "小田さくら", "野中美希", "牧野真莉愛", "羽賀朱音", "横山玲奈", "岡村ほまれ", "山﨑愛生",
            "北川莉央", "櫻井梨央", "井上春華", "弓桁朱琴" };
    public static String[] angermeG = { "上國料萌衣", "川村文乃", "伊勢鈴蘭", "橋迫鈴", "松本わかな", "川名凜", "為永幸音", "平山遊季", "後藤花",
            "下井谷幸穂" };
    public static String[] juicejuiceG = { "段原瑠々", "工藤由愛", "松永里愛", "井上玲音", "有澤一華", "石山咲良", "入江里咲", "江端妃咲",
            "遠藤彩加里", "川嶋美楓" };
    public static String[] camelliaG = { "谷本安美", "小野瑞歩", "小野田沙栞", "秋山眞緒", "福田真琳", "河西結心", "八木栞", "豫風瑠乃", "石井泉羽",
            "村田結生", "土井楓奏" };
    public static String[] beyooooonds = { "高瀬くるみ", "前田こころ", "岡村美波", "清野桃々姫", "島倉りか", "江口紗耶", "西田汐里", "平井美葉",
            "里吉うたの", "小林萌花" };
    public static String[] ochanorma = { "斉藤円香", "広本瑠璃", "石栗奏美", "米村姫良々", "窪田七海", "中山夏月姫", "田代すみれ", "西﨑美空", "北原もも",
            "筒井澪心" };
    public static String[] rosychronicle = { "橋田歩果", "吉田姫杷", "小野田華凜", "村越彩菜", "植村葉純", "松原ユリヤ", "島川波菜", "上村麗菜", "相馬優芽" };

    public static String[] morningO0105 = { "中澤裕子", "石黒彩", "飯田圭織", "安倍なつみ", "福田明日香", "矢口真里", "保田圭", "市井紗耶香", "後藤真希",
            "加護亜依", "辻希美", "吉澤ひとみ", "石川梨華", "高橋愛", "小川麻琴", "紺野あさ美", "新垣里沙" };
    public static String[] morningO0614 = { "道重さゆみ", "亀井絵里", "田中れいな", "藤本美貴", "久住小春", "光井愛佳", "ジュンジュン", "リンリン", "譜久村聖",
            "鈴木香音", "鞘師里保", "佐藤優樹", "飯窪春菜", "工藤遥", "尾形春水", "加賀楓", "森戸知沙希" };
    public static String[] taishisu = { "小湊美和", "稲葉貴子", "信田美帆", "RuRu" };
    public static String[] meron = { "柴田あゆみ", "大谷雅恵", "村田めぐみ", "斉藤瞳" };
    public static String[] soro = { "松浦亜弥", "前田有紀", "真野恵里菜" };
    public static String[] biyuden = { "三好絵梨香", "岡田唯" };
    public static String[] berryz = { "清水佐紀", "嗣永桃子", "石村舞波", "夏焼雅", "須藤茉麻", "徳永千奈美", "熊井友理奈", "菅谷梨沙子" };
    public static String[] cute = { "矢島舞美", "梅田えりか", "村上愛", "中島早貴", "岡井千聖", "鈴木愛理", "有原栞菜", "萩原舞" };
    public static String[] angermeO = { "和田彩花", "福田花音", "前田憂佳", "小川紗季", "竹内朱莉", "勝田里奈", "田村芽実", "中西香菜", "室田瑞希",
            "佐々木莉佳子", "相川茉穂",
            "笠原桃奈", "船木結", "太田遥香" };
    public static String[] juicejuiceO = { "宮本佳林", "金澤朋子", "高木紗友希", "宮崎由加", "稲場愛香", "梁川奈々美", "植村あかり" };
    public static String[] country = { "小関舞", "山木梨沙" };
    public static String[] magnolia = { "広瀬彩海", "野村みな美", "浜浦彩乃", "和田桜子", "藤井梨央", "小川麗奈", "田口夏実" };
    public static String[] camelliaO = { "小片リサ", "浅倉樹々", "岸本ゆめの", "山岸理子", "新沼希空" };
    public static String[] beyoO = { "一岡伶奈", "山﨑夢羽" };

    public static String[] name = { "モーニング娘。 現役", "アンジュルム 現役", "Juice=Juice 現役", "つばきファクトリー 現役", "BEYOOOOONDS現役",
            "OCHA NORMA", "ロージークロニクル" };
    public static String[] nameOG = { "モーニング娘。 1~5期", "モーニング娘。 6~14期", "太陽とシスコムーン", "メロン記念日", "ソロ", "美勇伝", "Berryz工房",
            "℃-ute", "アンジュルム(スマイレージ)", "Juice=Juice", "カントリー・ガールズ", "こぶしファクトリー", "つばきファクトリー", "BEYOOOOONDS" };
    public static Scanner sc = new Scanner(System.in);

    public static void shuffle() {
        int choice = 0;
        int kaisu = 0;
        String[] hako = new String[200];

        System.out.println("いれる >> 1    いれない >> 0");
        System.out.print("OG入れますか？\t>>");
        String og = sc.next();
        command(hako, og); // コマンド分岐
        for (int i = 0; i < name.length; i++) { // 問答無用で現役メンバー(もちろん全部0で入れないこともできる)
            System.out.print(name[i] + "\t>>");
            choice = sc.nextInt();
            if (kaesu(choice)) {
                hako = ireru(i, hako);
            }
        }
        if (kaesu(og)) { // ここはOGメンバー、普通には入れない
            System.out.print("\n");
            for (int i = 0; i < nameOG.length; i++) {
                System.out.print(nameOG[i] + "\t>>");
                choice = sc.nextInt();
                if (kaesu(choice)) {
                    hako = ireru(i + name.length, hako);
                }
            }
        }
        setting(hako, kaisu);

    }

    public static void setting(String[] hako, int kaisu) {
        System.out.print("\n重複を許しますか？\t>>");
        int chohukuNum = sc.nextInt();
        boolean chohuku = kaesu(chohukuNum);
        System.out.print("何人出しますか？\t>>");
        kaisu = sc.nextInt();
        memPrint(hako, kaisu, chohuku);
    }

    public static void memPrint(String[] hako, int kaisu, boolean chohuku) {
        if (!chohuku)
            ninzuCheck(hako, kaisu);
        System.out.println("\n" + "-----------------------------" + "\n");
        if (!chohuku) {
            String[] hakoDab = new String[nullHantei(hako)];
            String printMen;
            for (int i = 0; i < kaisu; i++) {
                printMen = hako[(int) (Math.random() * nullHantei(hako))];
                if (dabCheck(hakoDab, printMen)) {
                    hakoDab[nullHantei(hakoDab)] = printMen;
                } else if (!(dabCheck(hakoDab, printMen))) {
                    i--;
                    continue;
                }
                System.out.println(printMen);
                if ((kaisu != 1) && (i != kaisu - 1)) {
                    System.out.print("\n");
                }
            }
        } else if (chohuku) {
            for (int i = 0; i < kaisu; i++) {
                System.out.println(hako[(int) (Math.random() * nullHantei(hako))] + "\n");
            }
        }
        System.out.println("\n" + "-----------------------------");
        Choice.choice(hako, kaisu, "201", chohuku);
    }

    public static void command(String[] hako, String com) {
        switch (com) {
            case "all":
                for (int i = 0; i < (name.length + nameOG.length); i++) {
                    hako = ireru(i, hako);
                }
                setting(hako, 0);
                break;
            case "gen":
                for (int i = 0; i < name.length; i++) {
                    hako = ireru(i, hako);
                }
                setting(hako, 0);
                break;
            case "og":
                for (int i = 0; i < nameOG.length; i++) {
                    hako = ireru(i + name.length, hako);
                }
                setting(hako, 0);
                break;
            case "mas":
                Master.master(hako);
                break;
            default:
                break;
        }
        return;
    }

    // ここから雑魚メソッド

    public static boolean kaesu(int i) {
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    public static boolean kaesu(String word) {
        if (word.equals("1") || word.equals("0"))
            return kaesu(Integer.parseInt(word));
        return false;
    }

    public static String[] ireru(int i, String[] hako) {
        switch (i) {
            case 0:
                for (int j = 0; j < morningG.length; j++) {
                    hako[nullHantei(hako)] = morningG[j];
                }
                break;
            case 1:
                for (int j = 0; j < angermeG.length; j++) {
                    hako[nullHantei(hako)] = angermeG[j];
                }
                break;
            case 2:
                for (int j = 0; j < juicejuiceG.length; j++) {
                    hako[nullHantei(hako)] = juicejuiceG[j];
                }
                break;
            case 3:
                for (int j = 0; j < camelliaG.length; j++) {
                    hako[nullHantei(hako)] = camelliaG[j];
                }
                break;
            case 4:
                for (int j = 0; j < beyooooonds.length; j++) {
                    hako[nullHantei(hako)] = beyooooonds[j];
                }
                break;
            case 5:
                for (int j = 0; j < ochanorma.length; j++) {
                    hako[nullHantei(hako)] = ochanorma[j];
                }
                break;
            case 6:
                for (int j = 0; j < rosychronicle.length; j++) {
                    hako[nullHantei(hako)] = rosychronicle[j];
                }
                break;
            case 7:
                for (int j = 0; j < morningO0105.length; j++) {
                    hako[nullHantei(hako)] = morningO0105[j];
                }
                break;
            case 8:
                for (int j = 0; j < morningO0614.length; j++) {
                    hako[nullHantei(hako)] = morningO0614[j];
                }
                break;
            case 9:
                for (int j = 0; j < taishisu.length; j++) {
                    hako[nullHantei(hako)] = taishisu[j];
                }
                break;
            case 10:
                for (int j = 0; j < meron.length; j++) {
                    hako[nullHantei(hako)] = meron[j];
                }
                break;
            case 11:
                for (int j = 0; j < soro.length; j++) {
                    hako[nullHantei(hako)] = soro[j];
                }
                break;
            case 12:
                for (int j = 0; j < biyuden.length; j++) {
                    hako[nullHantei(hako)] = biyuden[j];
                }
                break;
            case 13:
                for (int j = 0; j < berryz.length; j++) {
                    hako[nullHantei(hako)] = berryz[j];
                }
                break;
            case 14:
                for (int j = 0; j < cute.length; j++) {
                    hako[nullHantei(hako)] = cute[j];
                }
                break;
            case 15:
                for (int j = 0; j < angermeO.length; j++) {
                    hako[nullHantei(hako)] = angermeO[j];
                }
                break;
            case 16:
                for (int j = 0; j < juicejuiceO.length; j++) {
                    hako[nullHantei(hako)] = juicejuiceO[j];
                }
                break;
            case 17:
                for (int j = 0; j < country.length; j++) {
                    hako[nullHantei(hako)] = country[j];
                }
                break;
            case 18:
                for (int j = 0; j < magnolia.length; j++) {
                    hako[nullHantei(hako)] = magnolia[j];
                }
                break;
            case 19:
                for (int j = 0; j < camelliaO.length; j++) {
                    hako[nullHantei(hako)] = camelliaO[j];
                }
                break;
            case 20:
                for (int j = 0; j < beyoO.length; j++) {
                    hako[nullHantei(hako)] = beyoO[j];
                }
            default:
                break;
        }
        return hako;
    }

    public static int nullHantei(String[] hako) {
        int nullDoko = 0;
        for (int i = 0; i < hako.length; i++) {
            if (hako[i] == null) {
                nullDoko = i;
                break;
            }
        }
        return nullDoko;
    }

    public static boolean dabCheck(String[] hako, String printMen) {// 被ってないならtrue
        for (int i = 0; i < nullHantei(hako); i++) {
            if (hako[i].equals(printMen)) {
                return false;
            }
        }
        return true;
    }

    public static void ninzuCheck(String hako[], int kaisu) {
        if (nullHantei(hako) < kaisu) {
            System.out.println("* 人数と表示する回数がおかしいです、それじゃ被ります *");
            Choice.choice(hako, kaisu, "201", true);
        }
    }
}
