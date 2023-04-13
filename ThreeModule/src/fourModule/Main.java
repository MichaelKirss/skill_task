package fourModule;

import static fourModule.Rect.space;

public class Main {

    public static void main(String[] args) {
        Tank justTank = new Tank();
        Tank anywareTank = new Tank(10, 10);
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();

//        int d = 15;
//        int k = 20;
//        Rect rect = new Rect(d,k);
//        space(d,k);
//
//        boolean b = (rect.getW() * rect.getH() == rect.getS());
//        System.out.println(b);
    }
}
