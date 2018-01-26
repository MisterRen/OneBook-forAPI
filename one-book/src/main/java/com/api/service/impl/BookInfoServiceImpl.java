package com.api.service.impl;

import com.api.dao.BookInfoDao;
import com.api.entity.BookInfo;
import com.api.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * <p>
 * </p>
 * <font size=0.25>Copyright (C) 2017 CheXiang. All Rights Reserved.</font>
 *
 * @author xinhe.REN (Create on:2017年12月09日)
 * @version 1.0
 * @fileName BookInfoServiceImpl.java
 */
@Service
public class BookInfoServiceImpl implements BookInfoService {
    @Autowired
    private BookInfoDao bookInfoDao;

    @Override
    public BookInfo findBookInfo(Integer id) {
        return bookInfoDao.findOne(id);
    }
}
