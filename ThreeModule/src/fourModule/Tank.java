package fourModule;

import static java.lang.Math.abs;


class Tank {
    static final String MODEL = "T34";
    static int count = 0;
    int x, y;
    int dir;
    int fuel;
    int number;



    public Tank() {
        this(0, 0, 100);
        this.number = counter(this.number);

    }

    public Tank(int x, int y) {
        this(x, y, 100);
        this.number = counter(this.number);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        this.number = counter(this.number);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getFuel(){
        return fuel;
    }
    public int getNumber(){
        return number;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setFuel( int fuel){
        this.fuel = fuel;
    }
    public void setNumber(int number){
        this.number = number;
    }


    public void goForward(int i) {
        if (i < 0 && -i > -fuel)
            i = -fuel;
        else if (i > fuel)
            i = fuel;
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
        fuel -= Math.abs(i);
    }

    public void printPosition() {
        System.out.println("The Tank is at "+MODEL+"-"+getNumber()+" " + getX() +", " + getY() + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }
    public int counter (int num){
        if (num ==0){
            num = ++count;
        }
        return num;
    }

}

