package top.wangqi2020.ssm.service;

import org.springframework.stereotype.Service;
import top.wangqi2020.ssm.dao.UserDao;
import top.wangqi2020.ssm.pojo.User;

import javax.annotation.Resource;
import java.util.*;

/**
 * 描述  用户详情查询方法
 *
 * @Author 王祁
 * @Date 2021/4/7 上午 12:21
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public User queryUserByUserId(Integer userId){
        return userDao.queryUserById(userId);
    }

    public List<User> queryAllUser() {
        return userDao.queryAllUser();
    }

    public String insertUser(User user){
        int s = userDao.insertUser(user);
        if (s > 0) {
            return "添加成功";
        }else{
            return "添加失败";
        }
    }
}
