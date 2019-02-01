package toly1994.com.toly01.hander;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import toly1994.com.toly01.hander.exception.NullAttrException;
import toly1994.com.toly01.hander.result.ResultBean;
import toly1994.com.toly01.hander.result.ResultEnum;
import toly1994.com.toly01.hander.result.ResultHandler;

/**
 * 异常捕获类
 */
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultBean handle(Exception e) {

        if (e instanceof NullAttrException) {
            return ResultHandler.error(ResultEnum.NULL_ATTR);
        }

        return ResultHandler.error(e.getMessage());
    }
}

