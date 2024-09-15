package Group1;
import Group0.MujunHantei;
import Group0.Year;

public class Born {
        public static void main(int[] toshi,int[] tsuki,int[] hi){
        int[] year={365,366};
        int[] day={-1,31,28,31,30,31,30,31,31,30,31,30,31,29};
        int[] ruiseki=new int[2];
        int kekka=0; 
        /* 〇〇[ 0 ]：誕生日
           〇〇[ 1 ]：今日  */ 

        for(int i=0;i<2;i++){
            MujunHantei.mujunHantei(toshi[i], tsuki[i], hi[i]);
        }
        for(int k=0;k<ruiseki.length;k++){
            
        if(toshi[0]!=toshi[1]){  //今年以前の年の計算
            for(int i=1900;i<toshi[k];i++){
            if(Year.Urudoshi(i)){
                ruiseki[k]+=year[1];
            }
            else {
                ruiseki[k]+=year[0];
            }
        }
        }

        for(int i=1; i<=tsuki[k]-1;i++){ //今年の日の計算
            if(i==2 && Year.Urudoshi(toshi[k])){
                ruiseki[k]+=day[13];
            }else{
                ruiseki[k]+=day[i];
            }
        }
        ruiseki[k]+=hi[k];
    }

        kekka=(ruiseki[1]-ruiseki[0]);
            System.out.println("君の誕生日から今日まで"+kekka+"日");


    }
}

