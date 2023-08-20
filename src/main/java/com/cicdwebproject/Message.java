package com.cicdwebproject;

public enum Message {
    HELLO("Hi, there!");

    private String msg;

    Message(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
