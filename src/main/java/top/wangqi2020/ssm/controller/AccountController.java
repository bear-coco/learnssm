package top.wangqi2020.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.wangqi2020.ssm.exception.BusinessException;
import top.wangqi2020.ssm.exception.ParamsException;
import top.wangqi2020.ssm.pojo.Account;
import top.wangqi2020.ssm.service.AccountService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述
 *      传统的访问方式
 *          http://localhost:8080/ssm/account/queryAccountById?accountId=1
 *      RESTFUL URL访问方式
 *          http://localhost:8080/ssm/account/1
 *
 * @Author 王祁
 * @Date 2021/4/9 下午 5:42
 */
@Controller
@RequestMapping("account")
public class AccountController {

    /**
     * 注入service层
     */
    @Resource
    private AccountService accountService;

    /**
     * 根据id查询账户信息
     * @param accountId 用户id
     * @return 返回信息
     */
    @GetMapping("/{accountId}")
    @ResponseBody
    public Object queryAccountById(@PathVariable Integer accountId){
//        int i = 1/0;
        //抛出参数异常
        if (true){
            throw new BusinessException();
        }
        Account account = accountService.queryAccountById(accountId);
        Map<String,Object> map = new HashMap<>(2);
        if (account == null){
            map.put("msg","查询失败！没有该id");
            map.put("code","404");
            return map;
        }
        return account;
    }

    /**
     * 根据id删除用户信息
     * @param accountId 用户id
     * @return 返回状态码
     */
    @DeleteMapping("/{accountId}")
    @ResponseBody
    public Map<String,Object> deleteAccountById(@PathVariable Integer accountId){
        Map<String,Object> map = new HashMap<>(2);
        int row = accountService.deleteAccountById(accountId);
        if (row > 0){
            map.put("code","200");
            map.put("msg","删除成功！");
        }else{
            map.put("code","404");
            map.put("msg","删除失败！");
        }
        return map;
    }

    /**
     * 添加账户操作
     * @param account 账户信息的 Json 格式的字符串
     * @return 返回状态码以及状态信息
     */
    @PostMapping("")
    @ResponseBody
    public Map<String,Object> addAccount(@RequestBody Account account){
        Map<String,Object> map = new HashMap<>(2);
        int row = accountService.addAccount(account);
        if (row > 0){
            map.put("code","200");
            map.put("msg","添加成功！");
        }else{
            map.put("code","404");
            map.put("msg","添加失败！");
        }
        return map;
    }

    /**
     * 更新操作
     * 不可以使用 put  会出现问题   所以使用 patch
     *      出现的问题
     *          如果使用put会显示方法不被允许
     *          因为我们需要传入pojo层的所有字段，才可以使用put，
     *          所以建议如果更新所有的内容的话，可以使用put，但是如果更新一部分的话建议使用patch
     * @param account 账户信息的JSON格式的字符串
     * @return 返回状态码和状态信息
     */
    @PatchMapping("")
    @ResponseBody
    public Map<String,Object> updateAccount(@RequestBody Account account){
        Map<String,Object> map = new HashMap<>();
        int row = accountService.updateAccount(account);
        if (row > 0){
            map.put("code","200");
            map.put("msg","更新成功！");
        }else{
            map.put("code","404");
            map.put("msg","更新失败！");
        }
        return map;
    }

}
