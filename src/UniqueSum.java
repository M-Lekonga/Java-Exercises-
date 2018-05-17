public class UniqueSum {
    public static int calMethod(int a, int b, int c){
        if (a==b&&b==c){
            return 0;
        }else if (a==b){
            return c;
        }else if (a==c){
            return b;
        }else if (b==c){
            return a;
        } else return a+b+c;


        //int d= a+b+c;
        //return d;
    }

    public static void main(String[] args) {
        int result = calMethod(7,7,10);
        System.out.println(result);
    }
}
