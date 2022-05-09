package com.example.controller.system;

import com.example.entity.User;
import com.example.entity.resp.ResponseResult;
import com.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户登录接口
 */
@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseResult login(@RequestParam("username") String username,
                                @RequestParam("password") String password) {
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        //登录操作
        return loginService.login(user);
    }


    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ResponseResult logout() {
        return loginService.logout();
    }
}
