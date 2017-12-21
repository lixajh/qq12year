package com.xmjd.qq12year.service.impl;

import com.xmjd.qq12year.dao.TblTvShowMapper;
import com.xmjd.qq12year.model.TblTvShow;
import com.xmjd.qq12year.service.TblTvShowService;
import com.xmjd.qq12year.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2017/12/19.
 */
@Service
@Transactional
public class TblTvShowServiceImpl extends AbstractService<TblTvShow> implements TblTvShowService {
    @Resource
    private TblTvShowMapper tblTvShowMapper;
    @Override
     public List<String> getList() {
                // TODO Auto-generated method stub
                
                                return tblTvShowMapper.getList();
            }
 
             @Override
     public Map<String, Object> getRecord(String date) {
                // TODO Auto-generated method stub
                        return tblTvShowMapper.getRecord(date);
            }
}
