package com.lehaha.SpringbootDemo.demos.web;

public class Response {
    public int code;
    public String message;
    public Data data;


    public Response(int code, String message, Data data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

}