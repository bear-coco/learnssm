package top.wangqi2020.ssm.exception;

/**
 * 描述 全局异常 参数异常类
 * @author 王祁
 * 时间：2021/4/17 下午 9:35
 */
public class ParamsException extends RuntimeException{

    private Integer code = 300;
    private String msg = "参数异常！";

    public ParamsException(){
        super("参数异常！");
    }

    public ParamsException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public ParamsException(Integer code){
        super("参数异常！");
        this.code = code;
    }

    public ParamsException(Integer code, String msg) {
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
