package com.xmjd.qq12year.dao;

import com.xmjd.qq12year.core.Mapper;
import com.xmjd.qq12year.model.TblTvShow;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface TblTvShowMapper extends Mapper<TblTvShow> {
    List<String> getList(@Param("date") Date date, @Param("addMonth")int addMonth);
    Map<String, Object> getRecord(String date);
    TblTvShow getToday();
}