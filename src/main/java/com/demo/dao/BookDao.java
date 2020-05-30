package com.demo.dao;

import org.springframework.stereotype.Repository;

/**
 * @author 李建成
 * @version 1.0
 * @date 2020/5/24 16:39
 */
@Repository
public class BookDao {

    private String lable = "1";

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public String toString() {
        return "BookDao [lable=" + lable + "]";
    }
}
