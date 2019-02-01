package toly1994.com.toly01.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者：张风捷特烈
 * 时间：2018/7/15:21:53
 * 邮箱：1981462002@qq.com
 * 说明：Controller
 */
@RestController//表示该类中的所有方法都会返回json格式
public class HelloSpringBoot {
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    public String say() {
//        return "HelloSpringBoot";
//    }
//}

    @GetMapping("/hello")
    public String say() {
        return "HelloSpringBoot!";
    }

////-----
//@RestController
//@RequestMapping(value = "/hello")
//public class HelloSpringBoot {
//    @GetMapping("/say")
//    public String say() {
//        return "HelloSpringBoot!!";
//    }
//}

////-----多url对一
//@RestController
//public class HelloSpringBoot {
//    @GetMapping({"/hello", "/hi"})
//    public String say() {
//        return "HelloSpringBoot!!!";
//    }
}

