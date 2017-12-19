package com.xmjd.qq12year.dao;

import com.xmjd.qq12year.core.Mapper;
import com.xmjd.qq12year.model.TblNews;

import java.util.Date;

public interface TblNewsMapper extends Mapper<TblNews> {
    TblNews findByDate(Date date);
}