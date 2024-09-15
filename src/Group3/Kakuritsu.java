package Group3;
public class Kakuritsu{
    public static void kaku(int bunbo){
        int kotae,seikai,kaisu;        
        seikai=1+(int)(Math.random() * bunbo);
        kotae=0;
        kaisu=0;

        while(seikai!=kotae){
            kotae=1+(int)(Math.random()*bunbo);
            kaisu++;
        }

        System.out.println("1/"+bunbo+"は "+kaisu+" 回かかりました。");
    }
}