package com.xmjd.qq12year.service.impl;

import com.xmjd.qq12year.dao.UserMapper;
import com.xmjd.qq12year.model.User;
import com.xmjd.qq12year.service.UserService;
import com.xmjd.qq12year.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/12/11.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
