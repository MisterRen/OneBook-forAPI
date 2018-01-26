package com.api.service;/**
 * Created by xinhe.REN on 2017/12/9.
 */

import com.api.entity.BookInfo;

/**
 * <p>
 * <p>
 * </p>
 * <font size=0.25>Copyright (C) 2017 CheXiang. All Rights Reserved.</font>
 *
 * @author xinhe.REN (Create on:2017年12月09日)
 * @version 1.0
 * @fileName BookInfoService.java
 */

public interface BookInfoService {

    BookInfo findBookInfo(Integer id);
}
