package com.example.lx.entity;

import org.springframework.stereotype.Component;

/**
 * @Author lixiang
 * @Date 2020/5/9 19:53
 * @Version 1.0
 */

@Component
public class User {

    int id;
    String username;
    String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

