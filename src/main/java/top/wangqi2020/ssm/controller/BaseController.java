package top.wangqi2020.ssm.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import top.wangqi2020.ssm.exception.BusinessException;
import top.wangqi2020.ssm.exception.ParamsException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 描述 全局异常处理方式三
 *
 * @author 王祁
 * 时间：2021/4/20 下午 3:25
 */
public class BaseController {

    @ExceptionHandler
    public String exc(HttpServletRequest request, HttpServletResponse response,Exception ex){
        request.setAttribute("ex",ex);
        if (ex instanceof ParamsException){
            request.setAttribute("ex",((ParamsException) ex).getMsg());
            return "params_error";
        }
        if (ex instanceof BusinessException){
            request.setAttribute("ex",((BusinessException) ex).getMsg());
            return "business_error";
        }
        return "error";
    }
}
