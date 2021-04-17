package top.wangqi2020.ssm.exception;

/**
 * 描述 全局异常 业务异常
 * @author 王祁
 * 时间：2021/4/17 下午 9:40
 */
public class BusinessException extends RuntimeException{

    private Integer code = 400;
    private String msg = "业务异常！";

    public BusinessException() {
        super("业务异常！");
    }

    public BusinessException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public BusinessException(Integer code) {
        super("业务异常！");
        this.code = code;
    }

    public BusinessException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
