package com.demo.service;

import com.demo.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 李建成
 * @version 1.0
 * @date 2020/5/24 16:39
 */
@Service
public class BookService {
    @Autowired
    private BookDao bookDao;
}
