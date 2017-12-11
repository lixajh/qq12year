package com.xmjd.qq12year.dao;

import com.xmjd.qq12year.core.Mapper;
import com.xmjd.qq12year.model.TblTvShow;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface TblTvShowMapper extends Mapper<TblTvShow> {
    List<String> getList();
    Map<String, Object> getRecord(String date);
}