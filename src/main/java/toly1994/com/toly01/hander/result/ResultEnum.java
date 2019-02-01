package toly1994.com.toly01.hander.result;

/**
 * 作者：张风捷特烈
 * 时间：2018/5/25:17:36
 * 邮箱：1981462002@qq.com
 * 说明：使用枚举类统一错误码与错误信息维护
 */
public enum ResultEnum {
    SUCCESS(200,"操作成功"),
    EXCEPTION(500, ""),
    NULL_ATTR(101,"属性为空");

    private int code;
    private String msg;

    ResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
