package Group0;
public class Year {
    public static String[] name={"令和","平成","昭和","大正","明治","慶応","元治","文久","万延","安政","嘉永","弘化","天保","文政","文化","享和","寛政","天明","安永","明和","宝暦","寛延","延享","寛保","元文","享保","正徳","宝永","元禄","貞享","天和","延宝","寛文","万治","明暦","承応","慶安","正保","寛永","元和"};
    public static int[] border={2019,1989,1926,1912,1868,1865,1864,1861,1860,1854,1848,1844,1830,1818,1804,1801,1789,1781,1772,1764,1751,1748,1744,1741,1736,1716,1711,1704,1688,1684,1681,1673,1661,1658,1655,1652,1648,1644,1624,1615,0};

    public static boolean Urudoshi(int y){
        if(((y >=1600) && (y%4==0) && (y % 100!=0) )|| (((y >= 1600)&&(y % 400==0)))){
            return true;
        }else{
            return false;
        }
    }

    public static int WarekiSeireki(String wa,int y){
        int seireki=0;
        for(int i=0;i<name.length;i++){
            if(wa.equals(name[i])){
                seireki=SeirekiTasu(y, border[i]-1);
            }
        }
        if(seireki==0){
            MujunHantei.Out();
        }
        return seireki;
    }

    public static String SeirekiWareki(int se){
            if(se>=border[0]){
                return name[0]+(se-border[0]);
            }
        for(int i=0;i<border.length-1;i++){
            if( (se<border[i]) && (se>border[i+1]) ){
                return name[i]+(se-(border[i+1]-1));
            }
            else if(se==border[i]){
                return name[i]+"元年"+"、"+name[i+1]+(border[i+1]-border[i]+1);
            }
        }
       return null;
    }

    private static int SeirekiTasu(int y,int zeroyear){
        int seireki;
        seireki=y+zeroyear;
        return seireki;
    }
}