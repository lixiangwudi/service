package com.example.lx.dao;

/**
 * @Author lixiang
 * @Date 2020/5/10 8:50
 * @Version 1.0
 */

import com.example.lx.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
    User findByUsername(String username);

    User getByUsernameAndPassword(String username,String password);
}
