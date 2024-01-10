package com.example.demo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    private String name;
    private int age;

    @JsonProperty("phone_number")
    private String phoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User(){
        this.name = null;
        this.age = 0;
        this.phoneNumber=null;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User defaultUser(){
        return new User("default",0);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
