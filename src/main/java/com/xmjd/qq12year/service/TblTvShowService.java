package com.xmjd.qq12year.service;
import com.xmjd.qq12year.model.TblTvShow;
import com.xmjd.qq12year.core.Service;

import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2017/12/19.
 */
public interface TblTvShowService extends Service<TblTvShow> {
    List<String> getList() ;
    Map<String,Object> getRecord(String date);
}
