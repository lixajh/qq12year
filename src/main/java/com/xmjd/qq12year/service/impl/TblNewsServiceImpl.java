package com.xmjd.qq12year.service.impl;

import com.xmjd.qq12year.dao.TblNewsMapper;
import com.xmjd.qq12year.model.TblNews;
import com.xmjd.qq12year.service.TblNewsService;
import com.xmjd.qq12year.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/12/17.
 */
@Service
@Transactional
public class TblNewsServiceImpl extends AbstractService<TblNews> implements TblNewsService {
    @Resource
    private TblNewsMapper tblNewsMapper;

}
