package com.example.springboot_test.domain;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description TODO
 * @Author EDZ
 * @Date 2019/4/3 15:19
 * @Version 1.0
 **/
public class User implements Serializable {

    private Integer id;
    private String name;
    private String pwd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
