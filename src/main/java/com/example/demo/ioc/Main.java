package com.example.demo.ioc;

public class Main {

    public static void main(String[] args) {

        String url="www.naver.com/books/it?page=10&size=60&name=spring-boot";

        //url encoding

        Encoder encoder= new Encoder();
        String result= encoder.encode(url);
        System.out.println(result);


    }
}
