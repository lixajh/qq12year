package com.xmjd.qq12year.service;
import com.xmjd.qq12year.model.TblNews;
import com.xmjd.qq12year.core.Service;

import java.util.Date;


/**
 * Created by CodeGenerator on 2017/12/19.
 */
public interface TblNewsService extends Service<TblNews> {
    TblNews findByDate(Date date);
}
