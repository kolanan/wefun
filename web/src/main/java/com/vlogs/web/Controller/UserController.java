package com.vlogs.web.Controller;

import com.vlogs.web.Service.UserService;
import com.vlogs.web.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nan on 2018/3/21 21:22
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/{id}")
        public User getUser(@PathVariable Integer id){

            return userService.findUserById(id);

    }
}
