package com.vlogs.web.mapper;

import com.vlogs.web.domain.User;


/**
 * Created by nan on 2018/3/21 21:10
 */
public interface UserMapper {
    User findUserById(Integer id);
}
