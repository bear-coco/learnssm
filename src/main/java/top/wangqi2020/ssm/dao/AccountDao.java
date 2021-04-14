package top.wangqi2020.ssm.dao;

import top.wangqi2020.ssm.pojo.Account;

/**
 * 描述 账户mapper接口
 *          操作数据库
 *              增删改查
 *
 * @Author 王祁
 * @Date 2021/4/9 下午 5:16
 */
public interface AccountDao {

    /**
     * 通过用户id查询用户信息
     * @param accountId 用户id
     * @return 返回对象
     */
    Account queryAccountById(Integer accountId);


    /**
     * 通过id删除用户
     * @param accountId 用户id
     * @return 返回受影响行数
     */
    int deleteAccountById(Integer accountId);

    /**
     * 增加用户
     * @param account 用户
     * @return 返回受影响行数
     */
    int addAccount(Account account);

    /**
     * 修改用户信息
     * @param account 用户
     * @return 返回受影响行数
     */
    int updateAccount(Account account);

}
