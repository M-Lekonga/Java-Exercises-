public class BlackJack {
    public int method(int x, int y ) {
        if (x > 21 && y > 21) {
            return 0;
        } else if (x > 21) {
            return y;
        } else if (y > 21) {
            return x;
        }
        else if (y>x){
            return y;
        }
        else{
            return x;
        }


    }

}





