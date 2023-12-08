package com.huazu.springbootweb.pojo;

import java.util.Date;

public class User extends Hobby{
    public static final int mkop=10;

    private int n=1;
    private Date time=new Date();

    public static void ss(){
        System.out.println("aaaas");
    }

    protected String ss(int asa){
        System.out.println(asa);
        return "asd";
    }

     void ss(String str){
        System.out.println(str);
    }
    public User() {

    }

    public User(int n, Date time) {
        this.n = n;
        this.time = time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
public static void pp(){
    System.out.println(mkop);
}
    public Date getTime() {
        return  time;
    }

}
