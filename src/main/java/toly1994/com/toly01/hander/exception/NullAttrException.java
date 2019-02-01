package toly1994.com.toly01.hander.exception;


import toly1994.com.toly01.hander.result.ResultEnum;

/**
 * 作者：张风捷特烈
 * 时间：2018/5/25:17:14
 * 邮箱：1981462002@qq.com
 * 说明：属性为空异常
 */
public class NullAttrException extends RuntimeException {
    private int code;
    private static String msg = ResultEnum.NULL_ATTR.getMsg();

    public NullAttrException() {
        super(msg);
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
