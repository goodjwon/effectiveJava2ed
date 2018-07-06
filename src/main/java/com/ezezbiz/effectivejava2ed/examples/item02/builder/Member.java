package com.ezezbiz.effectivejava2ed.examples.item02.builder;

public class Member {
    private String name; //mandatory
    private String email; //mandatory
    private String mobile; //optional
    private String address; //optional
    private String password; //optional
    private String state; //optional
    private int age; //optional
    //Getter, Setter, Constructor


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public String getState() {
        return state;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
