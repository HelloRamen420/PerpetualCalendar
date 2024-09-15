package Group1;


public class Kouka {
    public static void main (int kingaku){
        System.out.println("500円玉>>"+kingaku/500);
        System.out.println("100円玉"+(kingaku/100- kingaku/500*5));
        System.out.println("50円玉"+(kingaku/50-kingaku/100*2));
        System.out.println("10円玉"+(kingaku/10-kingaku/50*5 ));
        System.out.println("5円玉"+(kingaku/5-kingaku/10*2));
        System.out.println("1円玉"+(kingaku/1-kingaku/5*5));
    }
}
