package com.xmjd.qq12year.service;
import com.xmjd.qq12year.model.TblTvShow;
import com.xmjd.qq12year.core.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2017/12/19.
 */
public interface TblTvShowService extends Service<TblTvShow> {
    TblTvShow getToday();
    List<String> getList(Date date, int addMonth) ;
    Map<String,Object> getRecord(String date);
    void enableRecordBeforeToday();//使今天之前的所有记录都可用
}
