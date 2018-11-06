package org.monkey.ums.controller;

import org.monkey.ums.bean.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Monkey
 * @Date: Create in 2018/10/24 22:34
 * @Description:
 */
@RestController
public class UserController {
    /**
     * @author monkey
     * @Date: 2018/10/24
     * @Description:
     */
    @RequestMapping(value = "/allUser", method = RequestMethod.GET)
    public List<User> allUser() {
        return null;
    }

    /**
     * @Author:
     * @Date:
     * @Description:
     *
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello Spring Boot!";
    }

    /**
     * @author monkey
     * @Description
     *
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add(User user) {
        System.out.println(user);
        System.out.println(user.getId());
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());
        System.out.println(user.getTrueName());
        System.out.println(user.getStatus());
    }
}
