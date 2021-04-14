package top.wangqi2020.ssm.service;

import org.springframework.stereotype.Service;
import top.wangqi2020.ssm.dao.AccountDao;
import top.wangqi2020.ssm.pojo.Account;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述
 *
 * @Author 王祁
 * @Date 2021/4/9 下午 5:32
 */
@Service
public class AccountService {

    @Resource
    private AccountDao accountDao;

    /**
     * 通过用户id查询信息
     * @param accountId
     * @return
     */
    public Account queryAccountById(Integer accountId){
        return accountDao.queryAccountById(accountId);
    }

    /**
     * 删除用户 返回状态码
     * @param accountId
     * @return
     */
    public int deleteAccountById(Integer accountId){
        return accountDao.deleteAccountById(accountId);
    }

    /**
     * 添加用户
     * @param account
     * @return
     */
    public int addAccount(Account account){
        return accountDao.addAccount(account);
    }

    /**
     * 更新用户信息
     * @param account
     * @return
     */
    public int updateAccount(Account account){
        return accountDao.updateAccount(account);
    }

}
