package com.api.dao;/**
 * Created by xinhe.REN on 2017/12/9.
 */

import com.api.entity.BookInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * <p>
 * </p>
 * <font size=0.25>Copyright (C) 2017 CheXiang. All Rights Reserved.</font>
 *
 * @author xinhe.REN (Create on:2017年12月09日)
 * @version 1.0
 * @fileName BookInfoDao.java
 */
@Repository
public interface BookInfoDao extends JpaRepository<BookInfo,Integer> {
}
