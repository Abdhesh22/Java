public class objectDeep {
    public static void main(String[] args){
        int x = 5;
        int y = 6;

        Random r = new Random(5, 7);

        callByValue(x, y);
        System.out.println(x + " : " +  y);
        callByReference(r);
        System.out.println(r.x + " : " +  r.y);
    }

    static void callByValue(int x, int y){
        x += 10;
        y += 10;
    }

    static void callByReference(Random r){
        r.x += 10;
        r.y += 10;
    }

}

class Random {
    int x;
    int y;

    Random(int x, int y){
        this.x = x;
        this.y = y;
    }
}


