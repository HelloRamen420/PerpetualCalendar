package Group4;

public class Ripai {
    public static String[] ripai(String[] saishoPai){
        String[][] okiba=new String[11][14];
        String hozon;
        String[] owariPai=new String[14];
        char[] junban={'m','p','s','a','b','c','d','e','x','y','z'};
        int tsuginoSaishou;
        int[] dokoNull=new int[11];
        int m=0;

        for(int i=0;i<saishoPai.length;i++){
            for(int j=3;j<junban.length;j++){
                if(saishoPai[i].charAt(0)==junban[j]){
                    saishoPai[i]+=" ";
                }
            }
        }
        for(int i=0;i<junban.length;i++){//萬子で、筒子で、、、という風に

            for(int j=0;j<saishoPai.length;j++){//最初の牌を萬子の番なら萬子を、という風に抽出

                if( (junban[i]==saishoPai[j].charAt(0)) || (junban[i]==saishoPai[j].charAt(1)) ){//ifで選別して抽出

                    if(saishoPai[j].charAt(0)>0 && saishoPai[j].charAt(0)<10){//数牌を区別
                        okiba[i][j]=saishoPai[j];
                    }
                    else{//字を区別
                        okiba[i][j]=saishoPai[j];
                    }
                }
            }
        }

        for(int i=0;i<junban.length;i++){//nullを下に（整理整頓）
            int hairu=0;
            for(int j=0;j<saishoPai.length;j++){
                if(!(okiba[i][j]==null)){
                    hozon=okiba[i][j];
                    okiba[i][j]=null;
                    okiba[i][hairu]=hozon;
                    hairu++;
                }
            }
        }


        for(int i=0;i<junban.length;i++){//ソート

            for(int j=0;j<saishoPai.length;j++){
                dokoNull[i]=14;
                if(okiba[i][j]==null){
                    dokoNull[i]=j;
                    break;
                    }
                }

            if(i<3){

            for(int j=0;j<(dokoNull[i]-1);j++){
                tsuginoSaishou=j;
                for(int k= j+1; k<dokoNull[i] ; k++){
                    if(okiba[i][k].charAt(0) < okiba[i][tsuginoSaishou].charAt(0)){
                        tsuginoSaishou=k;
                    }
                }
                hozon=okiba[i][j];
                okiba[i][j]=okiba[i][tsuginoSaishou];
                okiba[i][tsuginoSaishou]=hozon;
            }
            }
        }

        for(int i=0;i<junban.length;i++){
            for(int j=0;j<dokoNull[i];j++){
                owariPai[m]=okiba[i][j];
                m++;
            }
        }

            return owariPai;
        }
    }
