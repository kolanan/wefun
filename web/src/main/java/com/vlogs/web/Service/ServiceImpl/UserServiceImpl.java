package com.vlogs.web.Service.ServiceImpl;

import com.vlogs.web.Service.UserService;
import com.vlogs.web.domain.User;
import com.vlogs.web.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nan on 2018/3/21 21:28
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public User findUserById(Integer id){
        return userMapper.findUserById(id);

    }
}
