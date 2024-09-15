package Group1;
import Main.Choice;
import java.util.Scanner;

public class Hikizan {
    public static void hikizan(){
        int nanmon;
        Scanner sc =new Scanner(System.in);
        System.out.println("１：n桁-m桁    ２：(10+a)-b");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("※10桁までにしてね");
                System.out.print("n桁>> ");
                int n=sc.nextInt();
                System.out.print("m桁>> ");
                int m=sc.nextInt();
                System.out.print("何問>> ");
                nanmon=sc.nextInt();
                System.out.println("--------------------------");
                for(int i=0;i<nanmon;i++){
                    shutsuryoku1(n, m);
                }
                break;
            case 2:
                System.out.print("何問>> ");
                nanmon=sc.nextInt();
                System.out.println("--------------------------");
                for(int i=0;i<nanmon;i++){
                    shutsuryoku2();
                }
                break;
            default:
                System.out.println("ちゃんと入力しろ \n\n------------------------------");
                hikizan();
                break;
        }
        System.out.println("--------------------------");
        Choice.choice("107");
    }


    public static void shutsuryoku1(int n,int m){
        int hikareru,hiku,kotae,kaitou;
        Scanner sc =new Scanner(System.in);
        do{
            hikareru=(int)(Math.random()*Math.pow(10,n))+1;
            hiku=(int)(Math.random()*Math.pow(10,m))+1;
        } while(!(hikareru>hiku && String.valueOf(hikareru).length()==n && String.valueOf(hiku).length()==m));

        kotae=hikareru-hiku;
        System.out.print(hikareru+" - "+hiku+" = ");
        kaitou=sc.nextInt();

        if(kaitou==kotae){
            System.out.println("正解！");
        }else{
            System.out.println("違う死ね("+kotae+")");
        }

    }

    public static void shutsuryoku2(){
        int hikareru,hikareru1,hiku,kotae,kaitou;
        Scanner sc =new Scanner(System.in);
        do{
            hikareru1=(int)(Math.random()*9)+1;
            hiku=(int)(Math.random()*9)+1;
        } while(hikareru1>hiku);

        hikareru=10+hikareru1;
        kotae=hikareru-hiku;
        System.out.print(hikareru+" - "+hiku+" = ");
        kaitou=sc.nextInt();

        if(kaitou==kotae){
            System.out.println("正解！");
        }else{
            System.out.println("違う死ね("+kotae+")");
        }

    }
}
