package toly1994.com.toly01.hander.result;

/**
 * 作者：张风捷特烈
 * 时间：2018/5/25:15:30
 * 邮箱：1981462002@qq.com
 * 说明：格式化请求返回值
 */
public class ResultBean<T> {
    private int code;
    private String msg;
    private T data;

    public ResultBean(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
