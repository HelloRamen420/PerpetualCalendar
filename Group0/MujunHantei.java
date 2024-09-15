package Group0;
public class MujunHantei {

    public static void mujunHantei(int y){
        if( (y<1600)){
            Out();
        }
    }
    public static void mujunHantei(int y,int m){
        if( (y<1600)||(m<1)||(12<m)){
            Out();
        }
    }
    public static void mujunHantei(int y,int m,int d){
        if( (y<1600)||(m<1)||(12<m)){
            Out();
        }
        else if((d<1)||(29<d)){
            switch(m){
                case 4:
                case 6:
                case 9:
                case 11:
                    if(d>30){
                        Out();
                    }
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if(d>31){
                        Out();
                    }
                    break;
                case 2:
                    if((YoubiSub.Urudoshi(y))&&(d>29)||(d>28)){
                        Out();
                    }
                    break;
            }
        }
    }

    public static void Out(){
        System.out.println("ダメです");
        System.exit(0);
    }
}