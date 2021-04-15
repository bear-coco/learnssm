package top.wangqi2020.ssm.dao;

import top.wangqi2020.ssm.pojo.User;

import java.util.List;

/**
 * 描述
 *
 * @Author 王祁
 * @Date 2021/4/7 上午 12:09
 */
public interface UserDao {

    /**
     * 通过id查询单个用户
     * @param userid 用户id
     * @return 返回User对象
     */
    User queryUserById(Integer userid);

    /**
     * 查询所有用户
     * @return 返回list对象
     */
    List<User> queryAllUser();

    /**
     * 插入用户信息
     * @param user 对象
     * @return 返回成功或者失败
     */
    int insertUser(User user);

}
