package com.shengdong;

public class HelloApi {

    private String message;
    private int index;

    //空构造函数
    public HelloApi() {
    }

    // 带参构造函数
    public HelloApi(String message, int index) {
        this.message = message;
        this.index = index;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getMessage() {
        return message;
    }

    public int getIndex() {
        return index;
    }

    public void sayHello() {
        System.out.println(index + ":" + message);
    }
}
