package Group4;
import java.util.Scanner;
public class Futen {
    public static int futenSimulator(){
        int futen=20;
        Scanner sc =new Scanner(System.in);
        System.out.println("質問に答えていくだけで符点が求まります。");


        System.out.print("①: ツモピン>>2, 七対子>>1, そうでない>>0\t>>");
        int zentei=sc.nextInt();
        if(zentei==2){
            return 20;
        }else if(zentei==1){
            return 25;
        }

        System.out.print("②: 門前ロン>>2, ツモ(副露も)>>1, それ以外>>0\t>>");
        int hora=sc.nextInt();
        if(hora==2){
            futen+=10;
        }else if(hora==1){
            futen+=2;
        }

        System.out.println("③: 刻子や槓子について聞いていきます。");

        System.out.println("まずは中張牌(2~8の牌)です。");
        futen+=kosuToFuten("1-1: 明刻の数\t>>", 2);
        futen+=kosuToFuten("1-2: 暗刻の数\t>>", 4);
        futen+=kosuToFuten("1-3: 明槓の数\t>>", 8);
        futen+=kosuToFuten("1-4: 暗槓の数\t>>", 16);
        System.out.println("お次は么九牌(1,9,字牌)です。");
        futen+=kosuToFuten("2-1: 明刻の数\t>>", 4);
        futen+=kosuToFuten("2-2: 暗刻の数\t>>", 8);
        futen+=kosuToFuten("2-3: 明槓の数\t>>", 16);
        futen+=kosuToFuten("2-4: 暗槓の数\t>>", 32);

        System.out.print("④: 雀頭が役牌 Yes>>1,No>>0\t>>");
        int atama=sc.nextInt();
        if(atama==1){
            futen+=2;
        }

        System.out.print("⑤: 待ちの形 辺張,嵌張,単騎,ノベタン>>1, それ以外>>0\t>>");
        int machi=sc.nextInt();
        if(machi==1){
            futen+=2;
        }

        futen=Hantei.kiriage(futen,2);
        return futen;
    }


    public static int kosuToFuten(String sentence,int kakeru){
        Scanner sc =new Scanner(System.in);
        System.out.print(sentence);
        int kosu=sc.nextInt();
        int tasuFuten=0;
        tasuFuten+=kakeru*kosu;
        return tasuFuten;
    }
}
