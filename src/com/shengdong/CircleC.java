package com.shengdong;

//该类CircleC引用了CircleA，造成循环依赖，也即循环引用
public class CircleC {

    private CircleA circleA;

    public CircleC() {
    }

    public CircleC(CircleA circleA) {
        this.circleA = circleA;
    }

    public void setCircleA(CircleA circleA) {
        this.circleA = circleA;
    }

    public void c() {
        circleA.a();
    }
}
