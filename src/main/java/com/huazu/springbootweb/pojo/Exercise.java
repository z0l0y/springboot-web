package com.huazu.springbootweb.pojo;

import java.awt.*;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Date;
import java.util.ArrayList;
import java.time.*;
import static java.lang.Math.*;

public class Exercise {

    public static void main(String... args) {
/*        System.out.println();
        System.out.println( );
        User.a = 12;
        System.out.println( new User().getA());*/
        /*        multiplyExact(1222222,1);*/
        System.out.println(0b01 >> 16);
        String greeting = "hello";
        System.out.println("ok".join("wrew", "aasda", "WErw", "Wew"));
        String a = "a " + "b";
        System.out.println("ok");
        String str = null;
        if (str != null) {
            str.length();
        }
        String op=new String();
        StringBuilder stringBuilder = new StringBuilder();
        String pp = stringBuilder.append(123).toString();
        System.out.println(pp);
        BigInteger bigInteger = new BigInteger("123333333333333");
        User q=new User();
        Date d=q.getTime();
        System.out.println(q.getTime());
        d.setTime(d.getTime()+1_000_000_000);
        System.out.println(q.getTime());
        java.time.LocalDate.now();
        NumberFormat.getCurrencyInstance();
        Hobby opp=new User();
        opp.ss();
        System.out.println(new User().hashCode());
        System.out.println(opp.hashCode());
        System.out.println("h".hashCode());
        int aops=10;
        String aop="AS"+aops;
        System.out.println(aop);
        new Point();
        Integer.valueOf(3);
        Integer akl=9;
        System.out.println(opp.getClass());
        System.out.println(opp.getClass().getSimpleName());
        System.out.println(int[].class.getSimpleName());
        Integer opda=10;
        System.out.println(opda);
    }
}
