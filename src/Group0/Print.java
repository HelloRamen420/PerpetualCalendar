package Group0;

import Main.Choice;

public class Print {

    public static void printMonth(int y,int m,String mae){
        int youbiNum,lastDay,j;
        String[] youbiName={"日曜日","月曜日","火曜日","水曜日","木曜日","金曜日","土曜日"};
        j=0;
        youbiNum=YoubiSub.youbiHantei(y, m);
        lastDay=Day.lastdayCount(y, m);
        MujunHantei.mujunHantei(y, m);

        System.out.println(y+"年"+m+"月");
            for(int i=0;i<7;i++){
                System.out.print(youbiName[i]+"\t");
            }
            System.out.println();
            for(int i=0;i<youbiNum;i++){
                System.out.print("\t");
            }
            j=youbiNum;
            for(int i=1;i<=lastDay;i++){
                System.out.print(String.format("%4d",i)+"\t");
                j++;
                if(j==7){
                    System.out.println();
                    j=0;
                }else if(i==lastDay){
                    System.out.println();
                }
            }
            Choice.choice(y, m, mae);
    }

    public static void printYear(int y ,String mae){
        for(int m=1;m<=12;m++){
            int youbiNum,lastDay,j;
            String[] youbiName={"日曜日","月曜日","火曜日","水曜日","木曜日","金曜日","土曜日"};
            j=0;
            youbiNum=YoubiSub.youbiHantei(y, m);
            lastDay=Day.lastdayCount(y, m);
            MujunHantei.mujunHantei(y,m);

            System.out.println(y+"年"+m+"月");
                for(int i=0;i<7;i++){
                    System.out.print(youbiName[i]+"\t");
                }
                System.out.println();
                for(int i=0;i<youbiNum;i++){
                    System.out.print("\t");
                }
                j=youbiNum;
                for(int i=1;i<=lastDay;i++){
                    System.out.print(String.format("%4d",i)+"\t");
                    j++;
                    if(j==7){
                        System.out.println();
                        j=0;
                    }else if(i==lastDay){
                        System.out.println();
                    }
                }
            }
        Choice.choice(y, 12, mae);
    }
}