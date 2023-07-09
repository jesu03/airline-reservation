package com.devrobot.springbootecommerce.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private String userid;
    private String name;
    private String email;
    private Long mobile;
    private int age;
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getMobile() {
        return mobile;
    }
    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public User() {
    }
    public User(String userid, String name, String email, Long mobile, int age) {
        this.userid = userid;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.age = age;
    }
    
}
