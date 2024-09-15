package Group1;

public class Kuku {
    public static void kake(int[] a){

        for(int j=0;j<3;j++){
            System.out.print("\t"+a[j]+"の段");
        }

        for(int i=1;i<=9;i++){
            System.out.println();
            System.out.print("\t");
            for(int j=0;j<3;j++){
                System.out.print(String.format("%4d",(a[j]*i))+"\t");
            }
        }
    }
}
