package Group1;

public class Nijihotesiki {
    public static void main(double a,double b,double c){
        double x1,x2;

        if((b*b - 4*a*c) == 0){
            x1= -b/(2*a);
            System.out.println("解は重解で"+ x1);
        }

        else if((b*b - 4*a*c)>0){
            x1=(-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
            x2=(-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
            System.out.println("解は" + x1 + " と "+ x2);
        }
        else{
        System.out.println("実数解はありません");
        }
    }
}

