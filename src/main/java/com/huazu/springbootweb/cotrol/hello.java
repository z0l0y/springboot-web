package com.huazu.springbootweb.cotrol;

import com.huazu.springbootweb.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class hello {
    //1.简单参数
    @RequestMapping("/simpleParam")//这又称为功能接口，（）里的是访问路径
    public String simpleParam(String username, Integer age) {
        System.out.println(username + ":" + age);
        return "OK";
    }
    //2.实体参数
    @RequestMapping("/simplePojo")
    public String simplePojo(User user) {
        System.out.println(user);
        return "OK";
    }
    //3.数组集合参数
    //数组
    @RequestMapping("/Pojo")
        public String Pojo(String[] hobby){
            System.out.println(Arrays.toString(hobby));
            return "OK";
    }
    //集合
    @RequestMapping("/listPojo")
    public String listPojo(@RequestParam List<String> hobby){
        System.out.println(hobby);
        return "OK";
    }
    //4。日期时间参数
    @RequestMapping("/date")
    public String date(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updatetime){
        System.out.println(updatetime);
        return "OK";
    }
    //5.json参数
    @RequestMapping("/json")
    public String json(@RequestBody User user) {
        System.out.println(user);
        return "OK";
    }
    //6.路径参数
    @RequestMapping("/path/{id}")
    public String path(@PathVariable Integer id) {
        System.out.println(id);
        return "OK";
    }

}
