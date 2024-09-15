package Group0;
public class YoubiSub {

    public static int youbiHantei(int y){
        int d,m,kekka,hozon,youbiNum;
        youbiNum=0;
        d=1;
        m=1;
        hozon=y;

        if(m==1||m==2){
            m+=12;
            y--;
            hozon--;
        }

        y=hozon+(y/4);
        y-=(hozon/100);
        y+=(hozon/400);
        m=(m*13+8)/5;
        kekka=y+m;
        kekka+=d;
        kekka=kekka%7;

        /* 日曜日：０
         * 月曜日：１
         * 火曜日：２
         * 水曜日：３
         * 木曜日；４
         * 金曜日：５
         * 土曜日：６*/

        switch(kekka){
            case 0:
                youbiNum=0;
                break;
            case 1:
                youbiNum=1;
                break;
            case 2:
                youbiNum=2;
                break;
            case 3:
                youbiNum=3;
                break;
            case 4:
                youbiNum=4;
                break;
            case 5:
                youbiNum=5;
                break;
            case 6:
                youbiNum=6;
                break;
        }
        return youbiNum;
    }
    
    public static int youbiHantei(int y,int m){
        int d,kekka,hozon,youbiNum;
        youbiNum=0;
        d=1;
        hozon=y;

        if(m==1||m==2){
            m+=12;
            y--;
            hozon--;
        }

        y=hozon+(y/4);
        y-=(hozon/100);
        y+=(hozon/400);
        m=(m*13+8)/5;
        kekka=y+m;
        kekka+=d;
        kekka=kekka%7;

        /* 日曜日：０
         * 月曜日：１
         * 火曜日：２
         * 水曜日：３
         * 木曜日；４
         * 金曜日：５
         * 土曜日：６*/

        switch(kekka){
            case 0:
                youbiNum=0;
                break;
            case 1:
                youbiNum=1;
                break;
            case 2:
                youbiNum=2;
                break;
            case 3:
                youbiNum=3;
                break;
            case 4:
                youbiNum=4;
                break;
            case 5:
                youbiNum=5;
                break;
            case 6:
                youbiNum=6;
                break;
        }
        return youbiNum;
    }
    public static boolean Urudoshi(int y){
        if(((y >=1600) && (y%4==0) && (y % 100!=0) )|| (((y >= 1600)&&(y % 400==0)))){
            return true;
        }else{
            return false;
        }
    }
}