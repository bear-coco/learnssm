package top.wangqi2020.ssm;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import top.wangqi2020.ssm.exception.BusinessException;
import top.wangqi2020.ssm.exception.ParamsException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 描述 全局异常处理二 实现HandlerExceptionResolver接口
 *
 * @author 王祁
 * 时间：2021/4/20 下午 1:13
 */
@Component
public class GlobalExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        // TODO 设置默认的视图与数据模型
        /* 设置默认的视图与数据模型 */
        // 设置视图
        ModelAndView modelAndView = new ModelAndView("error");
        //设置数据模型
        modelAndView.addObject("ex","报错了...");

        // TODO 设置自定义异常
        if (e instanceof ParamsException){
            modelAndView.setViewName("params_error");
            modelAndView.addObject("ex",((ParamsException) e).getMsg());
        }
        if (e instanceof BusinessException){
            modelAndView.setViewName("business_error");
            modelAndView.addObject("ex",((BusinessException) e).getMsg());
        }

        return modelAndView;
    }
}
