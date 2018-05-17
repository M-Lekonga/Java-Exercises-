public class TooHot {
    public static boolean mansHotMethod(boolean itsSummer, int temp ){
        int hot = 90;
        if (itsSummer){
            hot = 100;
        }
        if (temp>=60 && temp<=hot){
            return true;

        }
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(mansHotMethod(false,120));
    }
}
