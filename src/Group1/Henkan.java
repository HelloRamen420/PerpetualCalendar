package Group1;

import Group0.MujunHantei;

public class Henkan {
    
    public static void WtoS(String wa,int waYear){
        MujunHantei.mujunHantei(Group0.Year.WarekiSeireki(wa, waYear));
        System.out.println(wa+waYear+"年の西暦は"+Group0.Year.WarekiSeireki(wa, waYear)+"です。");
    }
    public static void StoW(int seireki){
        MujunHantei.mujunHantei(seireki);
        System.out.println("西暦"+seireki+"年は和暦"+Group0.Year.SeirekiWareki(seireki)+"年です");
    }
}
