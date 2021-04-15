package top.wangqi2020.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import top.wangqi2020.ssm.pojo.User;
import top.wangqi2020.ssm.service.UserService;

import javax.annotation.Resource;
import java.util.*;

/**
 * 描述
 *
 * @Author 王祁
 * @Date 2021/4/7 上午 12:28
 */
@Controller
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("queryUser")
    public ModelAndView queryUser(Integer userId){
        ModelAndView modelAndView = new ModelAndView();

        User user = userService.queryUserByUserId(userId);

        modelAndView.addObject("user",user);

        modelAndView.setViewName("user");

        return modelAndView;
    }


    @RequestMapping("queryAllUser")
    public ModelAndView queryAllUser(){
        ModelAndView modelAndView = new ModelAndView();

        List<User> list = userService.queryAllUser();

        modelAndView.addObject("list",list);

        modelAndView.setViewName("user");

        return modelAndView;
    }


    @RequestMapping("insertUser")
    public ModelAndView insertUser(String userName,String userPwd,Integer userAge){
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        user.setUserName(userName);
        user.setUserPwd(userPwd);
        user.setUserAge(userAge);
        //获取表单数据
        String msg = userService.insertUser(user);
        modelAndView.addObject("msg",msg);

        List<User> list = userService.queryAllUser();
        modelAndView.addObject("list",list);

        modelAndView.setViewName("user");

        return modelAndView;
    }

}
