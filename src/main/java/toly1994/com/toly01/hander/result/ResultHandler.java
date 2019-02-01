package toly1994.com.toly01.hander.result;

/**
 * 作者：张风捷特烈
 * 时间：2018/5/30:18:37
 * 邮箱：1981462002@qq.com
 * 说明：结果处理类
 */
public class ResultHandler {
    /**
     * 成功时将object对象转化为ResultBean对象
     *
     * @param o
     * @return
     */
    public static ResultBean ok(Object o) {

        return new ResultBean(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMsg(), o);
    }

    /**
     * 使用枚举列举错误类型
     *
     * @param error
     * @return
     */
    public static ResultBean error(ResultEnum error) {
        return new ResultBean(error.getCode(), error.getMsg(), null);
    }

    public static ResultBean error(String e) {
        return new ResultBean(ResultEnum.EXCEPTION.getCode(), e, null);
    }
}
