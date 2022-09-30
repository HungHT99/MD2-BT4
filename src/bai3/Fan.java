package bai3;

public class Fan {
    static final int SLOW=1;
    static final int MEDIUM=2;
    static final int FAST=3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    //khoi tao ham khoi tao va set thuoc tinh mac dinh .
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = " blue";
    }
    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if (this.on){
            return  "speed: "+ this.speed+"; color: "+this.color+", radius: "+ this.radius+", fan is on.";
        }else {
            return "color: "+this.color+", radius: "+ this.radius+", fan is off.";
        }
    }
}
