package fourModule;

public class Rect {
    private  static int s;
    private int w;
    private int h;
    Rect(int w, int h){
        this.w = w;
        this.h = h;
        s = w * h;
    }
    public static void space (int a, int b){
        s = a * b +s;
    }
    int getS(){
        return s;
    }
    int getW(){
        return w;
    }
    int getH(){
        return h;
    }
}
