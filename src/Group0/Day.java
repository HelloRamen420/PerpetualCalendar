package Group0;
public class Day {

    public static int lastdayCount(int y){
        int m=1;
        int lastday=0;
            switch(m){
                case 4:
                case 6:
                case 9:
                case 11:
                    lastday=30;
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    lastday=31;
                    break;
                case 2:
                    if(Year.Urudoshi(y)){
                        lastday=29;
                    }else{
                        lastday=28;
                    }
                    break;
            }
            return lastday;
        }
        
    public static int lastdayCount(int y,int m){
        int lastday=0;
            switch(m){
                case 4:
                case 6:
                case 9:
                case 11:
                    lastday=30;
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    lastday=31;
                    break;
                case 2:
                    if(Year.Urudoshi(y)){
                        lastday=29;
                    }else{
                        lastday=28;
                    }
                    break;
            }
            return lastday;
        }
    }